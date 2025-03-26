package com.dao;

import com.entity.NongchangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchangxinxiVO;
import com.entity.view.NongchangxinxiView;


/**
 * 农场信息
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface NongchangxinxiDao extends BaseMapper<NongchangxinxiEntity> {
	
	List<NongchangxinxiVO> selectListVO(@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);
	
	NongchangxinxiVO selectVO(@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);
	
	List<NongchangxinxiView> selectListView(@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);

	List<NongchangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);

	
	NongchangxinxiView selectView(@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);
	

}
