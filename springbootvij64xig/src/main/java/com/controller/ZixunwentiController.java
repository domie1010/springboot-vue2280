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

import com.entity.ZixunwentiEntity;
import com.entity.view.ZixunwentiView;

import com.service.ZixunwentiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 咨询问题
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@RestController
@RequestMapping("/zixunwenti")
public class ZixunwentiController {
    @Autowired
    private ZixunwentiService zixunwentiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixunwentiEntity zixunwenti,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			zixunwenti.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZixunwentiEntity> ew = new EntityWrapper<ZixunwentiEntity>();

		PageUtils page = zixunwentiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunwenti), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixunwentiEntity zixunwenti, 
		HttpServletRequest request){
        EntityWrapper<ZixunwentiEntity> ew = new EntityWrapper<ZixunwentiEntity>();

		PageUtils page = zixunwentiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunwenti), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixunwentiEntity zixunwenti){
       	EntityWrapper<ZixunwentiEntity> ew = new EntityWrapper<ZixunwentiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixunwenti, "zixunwenti")); 
        return R.ok().put("data", zixunwentiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixunwentiEntity zixunwenti){
        EntityWrapper< ZixunwentiEntity> ew = new EntityWrapper< ZixunwentiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixunwenti, "zixunwenti")); 
		ZixunwentiView zixunwentiView =  zixunwentiService.selectView(ew);
		return R.ok("查询咨询问题成功").put("data", zixunwentiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixunwentiEntity zixunwenti = zixunwentiService.selectById(id);
        return R.ok().put("data", zixunwenti);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixunwentiEntity zixunwenti = zixunwentiService.selectById(id);
        return R.ok().put("data", zixunwenti);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixunwentiEntity zixunwenti, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zixunwenti);
        zixunwentiService.insert(zixunwenti);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixunwentiEntity zixunwenti, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zixunwenti);
        zixunwentiService.insert(zixunwenti);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixunwentiEntity zixunwenti, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixunwenti);
        zixunwentiService.updateById(zixunwenti);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixunwentiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
