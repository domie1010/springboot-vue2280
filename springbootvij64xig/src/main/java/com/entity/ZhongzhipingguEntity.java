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
 * 种植评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@TableName("zhongzhipinggu")
public class ZhongzhipingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhongzhipingguEntity() {
		
	}
	
	public ZhongzhipingguEntity(T t) {
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
	 * 评估详情
	 */
					
	private String pingguxiangqing;
	
	/**
	 * 建议内容
	 */
					
	private String jianyineirong;
	
	/**
	 * 指导视频
	 */
					
	private String zhidaoshipin;
	
	/**
	 * 专家账号
	 */
					
	private String zhuanjiazhanghao;
	
	/**
	 * 专家姓名
	 */
					
	private String zhuanjiaxingming;
	
	/**
	 * 指导时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zhidaoshijian;
	
	
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
	 * 设置：评估详情
	 */
	public void setPingguxiangqing(String pingguxiangqing) {
		this.pingguxiangqing = pingguxiangqing;
	}
	/**
	 * 获取：评估详情
	 */
	public String getPingguxiangqing() {
		return pingguxiangqing;
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
	 * 设置：指导视频
	 */
	public void setZhidaoshipin(String zhidaoshipin) {
		this.zhidaoshipin = zhidaoshipin;
	}
	/**
	 * 获取：指导视频
	 */
	public String getZhidaoshipin() {
		return zhidaoshipin;
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
	 * 设置：指导时间
	 */
	public void setZhidaoshijian(Date zhidaoshijian) {
		this.zhidaoshijian = zhidaoshijian;
	}
	/**
	 * 获取：指导时间
	 */
	public Date getZhidaoshijian() {
		return zhidaoshijian;
	}

}
