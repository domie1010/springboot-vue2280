package com.entity.view;

import com.entity.ShengzhangjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 生长计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@TableName("shengzhangjihua")
public class ShengzhangjihuaView  extends ShengzhangjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengzhangjihuaView(){
	}
 
 	public ShengzhangjihuaView(ShengzhangjihuaEntity shengzhangjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, shengzhangjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
