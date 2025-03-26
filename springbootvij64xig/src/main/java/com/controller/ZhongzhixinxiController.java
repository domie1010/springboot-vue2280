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

import com.entity.ZhongzhixinxiEntity;
import com.entity.view.ZhongzhixinxiView;

import com.service.ZhongzhixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 种植信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@RestController
@RequestMapping("/zhongzhixinxi")
public class ZhongzhixinxiController {
    @Autowired
    private ZhongzhixinxiService zhongzhixinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongzhixinxiEntity zhongzhixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			zhongzhixinxi.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongzhixinxiEntity> ew = new EntityWrapper<ZhongzhixinxiEntity>();

		PageUtils page = zhongzhixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongzhixinxiEntity zhongzhixinxi, 
		HttpServletRequest request){
        EntityWrapper<ZhongzhixinxiEntity> ew = new EntityWrapper<ZhongzhixinxiEntity>();

		PageUtils page = zhongzhixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongzhixinxiEntity zhongzhixinxi){
       	EntityWrapper<ZhongzhixinxiEntity> ew = new EntityWrapper<ZhongzhixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongzhixinxi, "zhongzhixinxi")); 
        return R.ok().put("data", zhongzhixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongzhixinxiEntity zhongzhixinxi){
        EntityWrapper< ZhongzhixinxiEntity> ew = new EntityWrapper< ZhongzhixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongzhixinxi, "zhongzhixinxi")); 
		ZhongzhixinxiView zhongzhixinxiView =  zhongzhixinxiService.selectView(ew);
		return R.ok("查询种植信息成功").put("data", zhongzhixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongzhixinxiEntity zhongzhixinxi = zhongzhixinxiService.selectById(id);
        return R.ok().put("data", zhongzhixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongzhixinxiEntity zhongzhixinxi = zhongzhixinxiService.selectById(id);
        return R.ok().put("data", zhongzhixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhongzhixinxiEntity zhongzhixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhixinxi);
        zhongzhixinxiService.insert(zhongzhixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhongzhixinxiEntity zhongzhixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhixinxi);
        zhongzhixinxiService.insert(zhongzhixinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhongzhixinxiEntity zhongzhixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongzhixinxi);
        zhongzhixinxiService.updateById(zhongzhixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhongzhixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
