package com.dao;

import com.entity.GuoshuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuoshuleixingVO;
import com.entity.view.GuoshuleixingView;


/**
 * 果树类型
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface GuoshuleixingDao extends BaseMapper<GuoshuleixingEntity> {
	
	List<GuoshuleixingVO> selectListVO(@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);
	
	GuoshuleixingVO selectVO(@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);
	
	List<GuoshuleixingView> selectListView(@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);

	List<GuoshuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);

	
	GuoshuleixingView selectView(@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);
	

}
