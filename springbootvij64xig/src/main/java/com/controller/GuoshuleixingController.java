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

import com.entity.GuoshuleixingEntity;
import com.entity.view.GuoshuleixingView;

import com.service.GuoshuleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 果树类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
@RestController
@RequestMapping("/guoshuleixing")
public class GuoshuleixingController {
    @Autowired
    private GuoshuleixingService guoshuleixingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuoshuleixingEntity guoshuleixing,
		HttpServletRequest request){
        EntityWrapper<GuoshuleixingEntity> ew = new EntityWrapper<GuoshuleixingEntity>();

		PageUtils page = guoshuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuoshuleixingEntity guoshuleixing, 
		HttpServletRequest request){
        EntityWrapper<GuoshuleixingEntity> ew = new EntityWrapper<GuoshuleixingEntity>();

		PageUtils page = guoshuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuoshuleixingEntity guoshuleixing){
       	EntityWrapper<GuoshuleixingEntity> ew = new EntityWrapper<GuoshuleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guoshuleixing, "guoshuleixing")); 
        return R.ok().put("data", guoshuleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuoshuleixingEntity guoshuleixing){
        EntityWrapper< GuoshuleixingEntity> ew = new EntityWrapper< GuoshuleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guoshuleixing, "guoshuleixing")); 
		GuoshuleixingView guoshuleixingView =  guoshuleixingService.selectView(ew);
		return R.ok("查询果树类型成功").put("data", guoshuleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuoshuleixingEntity guoshuleixing = guoshuleixingService.selectById(id);
        return R.ok().put("data", guoshuleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuoshuleixingEntity guoshuleixing = guoshuleixingService.selectById(id);
        return R.ok().put("data", guoshuleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuoshuleixingEntity guoshuleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuleixing);
        guoshuleixingService.insert(guoshuleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuoshuleixingEntity guoshuleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuleixing);
        guoshuleixingService.insert(guoshuleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuoshuleixingEntity guoshuleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guoshuleixing);
        guoshuleixingService.updateById(guoshuleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guoshuleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
