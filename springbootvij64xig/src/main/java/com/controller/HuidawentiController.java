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

import com.entity.HuidawentiEntity;
import com.entity.view.HuidawentiView;

import com.service.HuidawentiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 回答问题
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@RestController
@RequestMapping("/huidawenti")
public class HuidawentiController {
    @Autowired
    private HuidawentiService huidawentiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuidawentiEntity huidawenti,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			huidawenti.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhuanjia")) {
			huidawenti.setZhuanjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuidawentiEntity> ew = new EntityWrapper<HuidawentiEntity>();

		PageUtils page = huidawentiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huidawenti), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuidawentiEntity huidawenti, 
		HttpServletRequest request){
        EntityWrapper<HuidawentiEntity> ew = new EntityWrapper<HuidawentiEntity>();

		PageUtils page = huidawentiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huidawenti), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuidawentiEntity huidawenti){
       	EntityWrapper<HuidawentiEntity> ew = new EntityWrapper<HuidawentiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huidawenti, "huidawenti")); 
        return R.ok().put("data", huidawentiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuidawentiEntity huidawenti){
        EntityWrapper< HuidawentiEntity> ew = new EntityWrapper< HuidawentiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huidawenti, "huidawenti")); 
		HuidawentiView huidawentiView =  huidawentiService.selectView(ew);
		return R.ok("查询回答问题成功").put("data", huidawentiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuidawentiEntity huidawenti = huidawentiService.selectById(id);
        return R.ok().put("data", huidawenti);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuidawentiEntity huidawenti = huidawentiService.selectById(id);
        return R.ok().put("data", huidawenti);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuidawentiEntity huidawenti, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huidawenti);
        huidawentiService.insert(huidawenti);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuidawentiEntity huidawenti, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huidawenti);
        huidawentiService.insert(huidawenti);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuidawentiEntity huidawenti, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huidawenti);
        huidawentiService.updateById(huidawenti);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huidawentiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
