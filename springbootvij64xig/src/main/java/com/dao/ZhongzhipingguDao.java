package com.dao;

import com.entity.ZhongzhipingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhipingguVO;
import com.entity.view.ZhongzhipingguView;


/**
 * 种植评估
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ZhongzhipingguDao extends BaseMapper<ZhongzhipingguEntity> {
	
	List<ZhongzhipingguVO> selectListVO(@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);
	
	ZhongzhipingguVO selectVO(@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);
	
	List<ZhongzhipingguView> selectListView(@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);

	List<ZhongzhipingguView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);

	
	ZhongzhipingguView selectView(@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);
	

}
