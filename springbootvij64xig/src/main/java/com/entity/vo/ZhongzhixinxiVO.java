package com.entity.vo;

import com.entity.ZhongzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 种植信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public class ZhongzhixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果树类型
	 */
	
	private String guoshuleixing;
		
	/**
	 * 果树图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 生长阶段
	 */
	
	private String shengzhangjieduan;
		
	/**
	 * 果树高度
	 */
	
	private String guoshugaodu;
		
	/**
	 * 病虫害发生
	 */
	
	private String bingchonghaifasheng;
		
	/**
	 * 施肥记录
	 */
	
	private String shifeijilu;
		
	/**
	 * 灌溉记录
	 */
	
	private String guangaijilu;
		
	/**
	 * 农场账号
	 */
	
	private String nongchangzhanghao;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：生长阶段
	 */
	 
	public void setShengzhangjieduan(String shengzhangjieduan) {
		this.shengzhangjieduan = shengzhangjieduan;
	}
	
	/**
	 * 获取：生长阶段
	 */
	public String getShengzhangjieduan() {
		return shengzhangjieduan;
	}
				
	
	/**
	 * 设置：果树高度
	 */
	 
	public void setGuoshugaodu(String guoshugaodu) {
		this.guoshugaodu = guoshugaodu;
	}
	
	/**
	 * 获取：果树高度
	 */
	public String getGuoshugaodu() {
		return guoshugaodu;
	}
				
	
	/**
	 * 设置：病虫害发生
	 */
	 
	public void setBingchonghaifasheng(String bingchonghaifasheng) {
		this.bingchonghaifasheng = bingchonghaifasheng;
	}
	
	/**
	 * 获取：病虫害发生
	 */
	public String getBingchonghaifasheng() {
		return bingchonghaifasheng;
	}
				
	
	/**
	 * 设置：施肥记录
	 */
	 
	public void setShifeijilu(String shifeijilu) {
		this.shifeijilu = shifeijilu;
	}
	
	/**
	 * 获取：施肥记录
	 */
	public String getShifeijilu() {
		return shifeijilu;
	}
				
	
	/**
	 * 设置：灌溉记录
	 */
	 
	public void setGuangaijilu(String guangaijilu) {
		this.guangaijilu = guangaijilu;
	}
	
	/**
	 * 获取：灌溉记录
	 */
	public String getGuangaijilu() {
		return guangaijilu;
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
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
