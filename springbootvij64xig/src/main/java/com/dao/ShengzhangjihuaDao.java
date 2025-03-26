package com.dao;

import com.entity.ShengzhangjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengzhangjihuaVO;
import com.entity.view.ShengzhangjihuaView;


/**
 * 生长计划
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ShengzhangjihuaDao extends BaseMapper<ShengzhangjihuaEntity> {
	
	List<ShengzhangjihuaVO> selectListVO(@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);
	
	ShengzhangjihuaVO selectVO(@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);
	
	List<ShengzhangjihuaView> selectListView(@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);

	List<ShengzhangjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);

	
	ShengzhangjihuaView selectView(@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);
	

}
