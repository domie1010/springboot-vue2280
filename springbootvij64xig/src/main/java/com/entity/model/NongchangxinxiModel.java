package com.entity.model;

import com.entity.NongchangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 农场信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public class NongchangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 农场图片
	 */
	
	private String nongchangtupian;
		
	/**
	 * 农场面积/亩
	 */
	
	private Double nongchangmianji;
		
	/**
	 * 土壤质量
	 */
	
	private String turangzhiliang;
		
	/**
	 * 农场设施
	 */
	
	private String nongchangsheshi;
		
	/**
	 * 农场账号
	 */
	
	private String nongchangzhanghao;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
				
	
	/**
	 * 设置：农场图片
	 */
	 
	public void setNongchangtupian(String nongchangtupian) {
		this.nongchangtupian = nongchangtupian;
	}
	
	/**
	 * 获取：农场图片
	 */
	public String getNongchangtupian() {
		return nongchangtupian;
	}
				
	
	/**
	 * 设置：农场面积/亩
	 */
	 
	public void setNongchangmianji(Double nongchangmianji) {
		this.nongchangmianji = nongchangmianji;
	}
	
	/**
	 * 获取：农场面积/亩
	 */
	public Double getNongchangmianji() {
		return nongchangmianji;
	}
				
	
	/**
	 * 设置：土壤质量
	 */
	 
	public void setTurangzhiliang(String turangzhiliang) {
		this.turangzhiliang = turangzhiliang;
	}
	
	/**
	 * 获取：土壤质量
	 */
	public String getTurangzhiliang() {
		return turangzhiliang;
	}
				
	
	/**
	 * 设置：农场设施
	 */
	 
	public void setNongchangsheshi(String nongchangsheshi) {
		this.nongchangsheshi = nongchangsheshi;
	}
	
	/**
	 * 获取：农场设施
	 */
	public String getNongchangsheshi() {
		return nongchangsheshi;
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
			
}
