package com.entity.vo;

import com.entity.GuoshuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 果树类型
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public class GuoshuleixingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String image;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setImage(String image) {
		this.image = image;
	}
	
	/**
	 * 获取：图片
	 */
	public String getImage() {
		return image;
	}
			
}
