package com.dao;

import com.entity.ZhongzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhixinxiVO;
import com.entity.view.ZhongzhixinxiView;


/**
 * 种植信息
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ZhongzhixinxiDao extends BaseMapper<ZhongzhixinxiEntity> {
	
	List<ZhongzhixinxiVO> selectListVO(@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);
	
	ZhongzhixinxiVO selectVO(@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);
	
	List<ZhongzhixinxiView> selectListView(@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);

	List<ZhongzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);

	
	ZhongzhixinxiView selectView(@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);
	

}
