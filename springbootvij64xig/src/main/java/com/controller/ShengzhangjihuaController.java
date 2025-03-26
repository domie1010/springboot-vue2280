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

import com.entity.ShengzhangjihuaEntity;
import com.entity.view.ShengzhangjihuaView;

import com.service.ShengzhangjihuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 生长计划
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@RestController
@RequestMapping("/shengzhangjihua")
public class ShengzhangjihuaController {
    @Autowired
    private ShengzhangjihuaService shengzhangjihuaService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShengzhangjihuaEntity shengzhangjihua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			shengzhangjihua.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShengzhangjihuaEntity> ew = new EntityWrapper<ShengzhangjihuaEntity>();

		PageUtils page = shengzhangjihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengzhangjihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShengzhangjihuaEntity shengzhangjihua, 
		HttpServletRequest request){
        EntityWrapper<ShengzhangjihuaEntity> ew = new EntityWrapper<ShengzhangjihuaEntity>();

		PageUtils page = shengzhangjihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengzhangjihua), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShengzhangjihuaEntity shengzhangjihua){
       	EntityWrapper<ShengzhangjihuaEntity> ew = new EntityWrapper<ShengzhangjihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shengzhangjihua, "shengzhangjihua")); 
        return R.ok().put("data", shengzhangjihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShengzhangjihuaEntity shengzhangjihua){
        EntityWrapper< ShengzhangjihuaEntity> ew = new EntityWrapper< ShengzhangjihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shengzhangjihua, "shengzhangjihua")); 
		ShengzhangjihuaView shengzhangjihuaView =  shengzhangjihuaService.selectView(ew);
		return R.ok("查询生长计划成功").put("data", shengzhangjihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShengzhangjihuaEntity shengzhangjihua = shengzhangjihuaService.selectById(id);
        return R.ok().put("data", shengzhangjihua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShengzhangjihuaEntity shengzhangjihua = shengzhangjihuaService.selectById(id);
        return R.ok().put("data", shengzhangjihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShengzhangjihuaEntity shengzhangjihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shengzhangjihua);
        shengzhangjihuaService.insert(shengzhangjihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShengzhangjihuaEntity shengzhangjihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shengzhangjihua);
        shengzhangjihuaService.insert(shengzhangjihua);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShengzhangjihuaEntity shengzhangjihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shengzhangjihua);
        shengzhangjihuaService.updateById(shengzhangjihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shengzhangjihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
