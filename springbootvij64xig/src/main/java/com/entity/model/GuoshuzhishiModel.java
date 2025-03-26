package com.entity.model;

import com.entity.GuoshuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 果树知识
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public class GuoshuzhishiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 适宜温度
	 */
	
	private String shiyiwendu;
		
	/**
	 * 适宜湿度
	 */
	
	private String shiyishidu;
		
	/**
	 * 种植详情
	 */
	
	private String zhongzhixiangqing;
		
	/**
	 * 适宜土壤
	 */
	
	private String shiyiturang;
		
	/**
	 * 灌溉方式
	 */
	
	private String guangaifangshi;
		
	/**
	 * 施肥详情
	 */
	
	private String shifeixiangqing;
		
	/**
	 * 果树图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 种植时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhongzhishijian;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：适宜温度
	 */
	 
	public void setShiyiwendu(String shiyiwendu) {
		this.shiyiwendu = shiyiwendu;
	}
	
	/**
	 * 获取：适宜温度
	 */
	public String getShiyiwendu() {
		return shiyiwendu;
	}
				
	
	/**
	 * 设置：适宜湿度
	 */
	 
	public void setShiyishidu(String shiyishidu) {
		this.shiyishidu = shiyishidu;
	}
	
	/**
	 * 获取：适宜湿度
	 */
	public String getShiyishidu() {
		return shiyishidu;
	}
				
	
	/**
	 * 设置：种植详情
	 */
	 
	public void setZhongzhixiangqing(String zhongzhixiangqing) {
		this.zhongzhixiangqing = zhongzhixiangqing;
	}
	
	/**
	 * 获取：种植详情
	 */
	public String getZhongzhixiangqing() {
		return zhongzhixiangqing;
	}
				
	
	/**
	 * 设置：适宜土壤
	 */
	 
	public void setShiyiturang(String shiyiturang) {
		this.shiyiturang = shiyiturang;
	}
	
	/**
	 * 获取：适宜土壤
	 */
	public String getShiyiturang() {
		return shiyiturang;
	}
				
	
	/**
	 * 设置：灌溉方式
	 */
	 
	public void setGuangaifangshi(String guangaifangshi) {
		this.guangaifangshi = guangaifangshi;
	}
	
	/**
	 * 获取：灌溉方式
	 */
	public String getGuangaifangshi() {
		return guangaifangshi;
	}
				
	
	/**
	 * 设置：施肥详情
	 */
	 
	public void setShifeixiangqing(String shifeixiangqing) {
		this.shifeixiangqing = shifeixiangqing;
	}
	
	/**
	 * 获取：施肥详情
	 */
	public String getShifeixiangqing() {
		return shifeixiangqing;
	}
				
	
	/**
	 * 设置：果树图片
	 */
	 
	public void setGuoshutupian(String guoshutupian) {
		this.guoshutupian = guoshutupian;
	}
	
	/**
	 * 获取：果树图片
	 */
	public String getGuoshutupian() {
		return guoshutupian;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：种植时间
	 */
	 
	public void setZhongzhishijian(Date zhongzhishijian) {
		this.zhongzhishijian = zhongzhishijian;
	}
	
	/**
	 * 获取：种植时间
	 */
	public Date getZhongzhishijian() {
		return zhongzhishijian;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
