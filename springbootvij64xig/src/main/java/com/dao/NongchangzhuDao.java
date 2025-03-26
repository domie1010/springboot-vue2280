package com.dao;

import com.entity.NongchangzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchangzhuVO;
import com.entity.view.NongchangzhuView;


/**
 * 农场主
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface NongchangzhuDao extends BaseMapper<NongchangzhuEntity> {
	
	List<NongchangzhuVO> selectListVO(@Param("ew") Wrapper<NongchangzhuEntity> wrapper);
	
	NongchangzhuVO selectVO(@Param("ew") Wrapper<NongchangzhuEntity> wrapper);
	
	List<NongchangzhuView> selectListView(@Param("ew") Wrapper<NongchangzhuEntity> wrapper);

	List<NongchangzhuView> selectListView(Pagination page,@Param("ew") Wrapper<NongchangzhuEntity> wrapper);

	
	NongchangzhuView selectView(@Param("ew") Wrapper<NongchangzhuEntity> wrapper);
	

}
