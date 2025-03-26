package com.entity.view;

import com.entity.ZhongzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 种植信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
@TableName("zhongzhixinxi")
public class ZhongzhixinxiView  extends ZhongzhixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongzhixinxiView(){
	}
 
 	public ZhongzhixinxiView(ZhongzhixinxiEntity zhongzhixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhongzhixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
