package com.entity.view;

import com.entity.GuoshuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 果树类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
@TableName("guoshuleixing")
public class GuoshuleixingView  extends GuoshuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuoshuleixingView(){
	}
 
 	public GuoshuleixingView(GuoshuleixingEntity guoshuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, guoshuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
