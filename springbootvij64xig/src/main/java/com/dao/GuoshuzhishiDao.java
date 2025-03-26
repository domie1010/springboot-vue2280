package com.dao;

import com.entity.GuoshuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuoshuzhishiVO;
import com.entity.view.GuoshuzhishiView;


/**
 * 果树知识
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface GuoshuzhishiDao extends BaseMapper<GuoshuzhishiEntity> {
	
	List<GuoshuzhishiVO> selectListVO(@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);
	
	GuoshuzhishiVO selectVO(@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);
	
	List<GuoshuzhishiView> selectListView(@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);

	List<GuoshuzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);

	
	GuoshuzhishiView selectView(@Param("ew") Wrapper<GuoshuzhishiEntity> wrapper);
	

}
