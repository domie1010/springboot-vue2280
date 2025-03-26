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
 * 咨询问题
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@TableName("zixunwenti")
public class ZixunwentiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZixunwentiEntity() {
		
	}
	
	public ZixunwentiEntity(T t) {
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
	 * 果树名称
	 */
					
	private String guoshumingcheng;
	
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
	 * 设置：果树名称
	 */
	public void setGuoshumingcheng(String guoshumingcheng) {
		this.guoshumingcheng = guoshumingcheng;
	}
	/**
	 * 获取：果树名称
	 */
	public String getGuoshumingcheng() {
		return guoshumingcheng;
	}
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

}
