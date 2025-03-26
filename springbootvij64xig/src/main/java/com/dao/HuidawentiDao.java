package com.dao;

import com.entity.HuidawentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuidawentiVO;
import com.entity.view.HuidawentiView;


/**
 * 回答问题
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface HuidawentiDao extends BaseMapper<HuidawentiEntity> {
	
	List<HuidawentiVO> selectListVO(@Param("ew") Wrapper<HuidawentiEntity> wrapper);
	
	HuidawentiVO selectVO(@Param("ew") Wrapper<HuidawentiEntity> wrapper);
	
	List<HuidawentiView> selectListView(@Param("ew") Wrapper<HuidawentiEntity> wrapper);

	List<HuidawentiView> selectListView(Pagination page,@Param("ew") Wrapper<HuidawentiEntity> wrapper);

	
	HuidawentiView selectView(@Param("ew") Wrapper<HuidawentiEntity> wrapper);
	

}
