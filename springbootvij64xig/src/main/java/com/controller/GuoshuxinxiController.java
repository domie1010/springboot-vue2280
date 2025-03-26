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

import com.entity.GuoshuxinxiEntity;
import com.entity.view.GuoshuxinxiView;

import com.service.GuoshuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 果树信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
@RestController
@RequestMapping("/guoshuxinxi")
public class GuoshuxinxiController {
    @Autowired
    private GuoshuxinxiService guoshuxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuoshuxinxiEntity guoshuxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			guoshuxinxi.setNongchangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();

		PageUtils page = guoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuoshuxinxiEntity guoshuxinxi, 
		HttpServletRequest request){
        EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();

		PageUtils page = guoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuoshuxinxiEntity guoshuxinxi){
       	EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guoshuxinxi, "guoshuxinxi")); 
        return R.ok().put("data", guoshuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuoshuxinxiEntity guoshuxinxi){
        EntityWrapper< GuoshuxinxiEntity> ew = new EntityWrapper< GuoshuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guoshuxinxi, "guoshuxinxi")); 
		GuoshuxinxiView guoshuxinxiView =  guoshuxinxiService.selectView(ew);
		return R.ok("查询果树信息成功").put("data", guoshuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuoshuxinxiEntity guoshuxinxi = guoshuxinxiService.selectById(id);
		guoshuxinxi.setClicktime(new Date());
		guoshuxinxiService.updateById(guoshuxinxi);
        guoshuxinxi = guoshuxinxiService.selectView(new EntityWrapper<GuoshuxinxiEntity>().eq("id", id));
        return R.ok().put("data", guoshuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuoshuxinxiEntity guoshuxinxi = guoshuxinxiService.selectById(id);
		guoshuxinxi.setClicktime(new Date());
		guoshuxinxiService.updateById(guoshuxinxi);
        guoshuxinxi = guoshuxinxiService.selectView(new EntityWrapper<GuoshuxinxiEntity>().eq("id", id));
        return R.ok().put("data", guoshuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuxinxi);
        guoshuxinxiService.insert(guoshuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuxinxi);
        guoshuxinxiService.insert(guoshuxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guoshuxinxi);
        guoshuxinxiService.updateById(guoshuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guoshuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = guoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuxinxi), params), params));
        return R.ok().put("data", page);
    }










}
