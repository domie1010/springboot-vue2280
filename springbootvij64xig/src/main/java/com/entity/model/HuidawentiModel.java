package com.entity.model;

import com.entity.HuidawentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 回答问题
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public class HuidawentiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果树类型
	 */
	
	private String guoshuleixing;
		
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
	 * 果树图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 咨询内容
	 */
	
	private String zixunneirong;
		
	/**
	 * 咨询时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zixunshijian;
		
	/**
	 * 农场账号
	 */
	
	private String nongchangzhanghao;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 专家账号
	 */
	
	private String zhuanjiazhanghao;
		
	/**
	 * 专家姓名
	 */
	
	private String zhuanjiaxingming;
		
	/**
	 * 建议内容
	 */
	
	private String jianyineirong;
		
	/**
	 * 知识普及
	 */
	
	private String zhishipuji;
				
	
	/**
	 * 设置：果树类型
	 */
	 
	public void setGuoshuleixing(String guoshuleixing) {
		this.guoshuleixing = guoshuleixing;
	}
	
	/**
	 * 获取：果树类型
	 */
	public String getGuoshuleixing() {
		return guoshuleixing;
	}
				
	
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
	 * 设置：咨询内容
	 */
	 
	public void setZixunneirong(String zixunneirong) {
		this.zixunneirong = zixunneirong;
	}
	
	/**
	 * 获取：咨询内容
	 */
	public String getZixunneirong() {
		return zixunneirong;
	}
				
	
	/**
	 * 设置：咨询时间
	 */
	 
	public void setZixunshijian(Date zixunshijian) {
		this.zixunshijian = zixunshijian;
	}
	
	/**
	 * 获取：咨询时间
	 */
	public Date getZixunshijian() {
		return zixunshijian;
	}
				
	
	/**
	 * 设置：农场账号
	 */
	 
	public void setNongchangzhanghao(String nongchangzhanghao) {
		this.nongchangzhanghao = nongchangzhanghao;
	}
	
	/**
	 * 获取：农场账号
	 */
	public String getNongchangzhanghao() {
		return nongchangzhanghao;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：专家账号
	 */
	 
	public void setZhuanjiazhanghao(String zhuanjiazhanghao) {
		this.zhuanjiazhanghao = zhuanjiazhanghao;
	}
	
	/**
	 * 获取：专家账号
	 */
	public String getZhuanjiazhanghao() {
		return zhuanjiazhanghao;
	}
				
	
	/**
	 * 设置：专家姓名
	 */
	 
	public void setZhuanjiaxingming(String zhuanjiaxingming) {
		this.zhuanjiaxingming = zhuanjiaxingming;
	}
	
	/**
	 * 获取：专家姓名
	 */
	public String getZhuanjiaxingming() {
		return zhuanjiaxingming;
	}
				
	
	/**
	 * 设置：建议内容
	 */
	 
	public void setJianyineirong(String jianyineirong) {
		this.jianyineirong = jianyineirong;
	}
	
	/**
	 * 获取：建议内容
	 */
	public String getJianyineirong() {
		return jianyineirong;
	}
				
	
	/**
	 * 设置：知识普及
	 */
	 
	public void setZhishipuji(String zhishipuji) {
		this.zhishipuji = zhishipuji;
	}
	
	/**
	 * 获取：知识普及
	 */
	public String getZhishipuji() {
		return zhishipuji;
	}
			
}
