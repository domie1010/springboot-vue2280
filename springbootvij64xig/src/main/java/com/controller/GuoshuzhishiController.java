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

import com.entity.GuoshuzhishiEntity;
import com.entity.view.GuoshuzhishiView;

import com.service.GuoshuzhishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 果树知识
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
@RestController
@RequestMapping("/guoshuzhishi")
public class GuoshuzhishiController {
    @Autowired
    private GuoshuzhishiService guoshuzhishiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuoshuzhishiEntity guoshuzhishi,
		HttpServletRequest request){
        EntityWrapper<GuoshuzhishiEntity> ew = new EntityWrapper<GuoshuzhishiEntity>();

		PageUtils page = guoshuzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuzhishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuoshuzhishiEntity guoshuzhishi, 
		HttpServletRequest request){
        EntityWrapper<GuoshuzhishiEntity> ew = new EntityWrapper<GuoshuzhishiEntity>();

		PageUtils page = guoshuzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuzhishi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuoshuzhishiEntity guoshuzhishi){
       	EntityWrapper<GuoshuzhishiEntity> ew = new EntityWrapper<GuoshuzhishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guoshuzhishi, "guoshuzhishi")); 
        return R.ok().put("data", guoshuzhishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuoshuzhishiEntity guoshuzhishi){
        EntityWrapper< GuoshuzhishiEntity> ew = new EntityWrapper< GuoshuzhishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guoshuzhishi, "guoshuzhishi")); 
		GuoshuzhishiView guoshuzhishiView =  guoshuzhishiService.selectView(ew);
		return R.ok("查询果树知识成功").put("data", guoshuzhishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuoshuzhishiEntity guoshuzhishi = guoshuzhishiService.selectById(id);
        return R.ok().put("data", guoshuzhishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuoshuzhishiEntity guoshuzhishi = guoshuzhishiService.selectById(id);
        return R.ok().put("data", guoshuzhishi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuoshuzhishiEntity guoshuzhishi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuzhishi);
        guoshuzhishiService.insert(guoshuzhishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuoshuzhishiEntity guoshuzhishi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuzhishi);
        guoshuzhishiService.insert(guoshuzhishi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuoshuzhishiEntity guoshuzhishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guoshuzhishi);
        guoshuzhishiService.updateById(guoshuzhishi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guoshuzhishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
