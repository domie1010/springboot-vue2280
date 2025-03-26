package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhongzhipingguEntity;
import com.entity.view.ZhongzhipingguView;

import com.service.ZhongzhipingguService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 种植评估
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@RestController
@RequestMapping("/zhongzhipinggu")
public class ZhongzhipingguController {
    @Autowired
    private ZhongzhipingguService zhongzhipingguService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongzhipingguEntity zhongzhipinggu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			zhongzhipinggu.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhuanjia")) {
			zhongzhipinggu.setZhuanjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongzhipingguEntity> ew = new EntityWrapper<ZhongzhipingguEntity>();

		PageUtils page = zhongzhipingguService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhipinggu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongzhipingguEntity zhongzhipinggu, 
		HttpServletRequest request){
        EntityWrapper<ZhongzhipingguEntity> ew = new EntityWrapper<ZhongzhipingguEntity>();

		PageUtils page = zhongzhipingguService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhipinggu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongzhipingguEntity zhongzhipinggu){
       	EntityWrapper<ZhongzhipingguEntity> ew = new EntityWrapper<ZhongzhipingguEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongzhipinggu, "zhongzhipinggu")); 
        return R.ok().put("data", zhongzhipingguService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongzhipingguEntity zhongzhipinggu){
        EntityWrapper< ZhongzhipingguEntity> ew = new EntityWrapper< ZhongzhipingguEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongzhipinggu, "zhongzhipinggu")); 
		ZhongzhipingguView zhongzhipingguView =  zhongzhipingguService.selectView(ew);
		return R.ok("查询种植评估成功").put("data", zhongzhipingguView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongzhipingguEntity zhongzhipinggu = zhongzhipingguService.selectById(id);
        return R.ok().put("data", zhongzhipinggu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongzhipingguEntity zhongzhipinggu = zhongzhipingguService.selectById(id);
        return R.ok().put("data", zhongzhipinggu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhongzhipingguEntity zhongzhipinggu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhipinggu);
        zhongzhipingguService.insert(zhongzhipinggu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhongzhipingguEntity zhongzhipinggu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhipinggu);
        zhongzhipingguService.insert(zhongzhipinggu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhongzhipingguEntity zhongzhipinggu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongzhipinggu);
        zhongzhipingguService.updateById(zhongzhipinggu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhongzhipingguService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
