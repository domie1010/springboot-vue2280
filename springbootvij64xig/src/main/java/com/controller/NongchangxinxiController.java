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

import com.entity.NongchangxinxiEntity;
import com.entity.view.NongchangxinxiView;

import com.service.NongchangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 农场信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
@RestController
@RequestMapping("/nongchangxinxi")
public class NongchangxinxiController {
    @Autowired
    private NongchangxinxiService nongchangxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongchangxinxiEntity nongchangxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			nongchangxinxi.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<NongchangxinxiEntity> ew = new EntityWrapper<NongchangxinxiEntity>();

		PageUtils page = nongchangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongchangxinxiEntity nongchangxinxi, 
		HttpServletRequest request){
        EntityWrapper<NongchangxinxiEntity> ew = new EntityWrapper<NongchangxinxiEntity>();

		PageUtils page = nongchangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchangxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongchangxinxiEntity nongchangxinxi){
       	EntityWrapper<NongchangxinxiEntity> ew = new EntityWrapper<NongchangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongchangxinxi, "nongchangxinxi")); 
        return R.ok().put("data", nongchangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongchangxinxiEntity nongchangxinxi){
        EntityWrapper< NongchangxinxiEntity> ew = new EntityWrapper< NongchangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongchangxinxi, "nongchangxinxi")); 
		NongchangxinxiView nongchangxinxiView =  nongchangxinxiService.selectView(ew);
		return R.ok("查询农场信息成功").put("data", nongchangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongchangxinxiEntity nongchangxinxi = nongchangxinxiService.selectById(id);
        return R.ok().put("data", nongchangxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongchangxinxiEntity nongchangxinxi = nongchangxinxiService.selectById(id);
        return R.ok().put("data", nongchangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NongchangxinxiEntity nongchangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(nongchangxinxi);
        nongchangxinxiService.insert(nongchangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NongchangxinxiEntity nongchangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(nongchangxinxi);
        nongchangxinxiService.insert(nongchangxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody NongchangxinxiEntity nongchangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongchangxinxi);
        nongchangxinxiService.updateById(nongchangxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nongchangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
