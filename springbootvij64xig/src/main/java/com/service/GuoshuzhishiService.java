package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuoshuzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuoshuzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoshuzhishiView;


/**
 * 果树知识
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface GuoshuzhishiService extends IService<GuoshuzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuoshuzhishiVO> selectListVO(Wrapper<GuoshuzhishiEntity> wrapper);
   	
   	GuoshuzhishiVO selectVO(@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);
   	
   	List<GuoshuzhishiView> selectListView(Wrapper<GuoshuzhishiEntity> wrapper);
   	
   	GuoshuzhishiView selectView(@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuoshuzhishiEntity> wrapper);

   	

}

