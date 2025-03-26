package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 农场信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
@TableName("nongchangxinxi")
public class NongchangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongchangxinxiEntity() {
		
	}
	
	public NongchangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 农场名称
	 */
					
	private String nongchangmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：农场名称
	 */
	public void setNongchangmingcheng(String nongchangmingcheng) {
		this.nongchangmingcheng = nongchangmingcheng;
	}
	/**
	 * 获取：农场名称
	 */
	public String getNongchangmingcheng() {
		return nongchangmingcheng;
	}
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
