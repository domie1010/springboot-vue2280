package com.dao;

import com.entity.ZixunwentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunwentiVO;
import com.entity.view.ZixunwentiView;


/**
 * 咨询问题
 * 
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ZixunwentiDao extends BaseMapper<ZixunwentiEntity> {
	
	List<ZixunwentiVO> selectListVO(@Param("ew") Wrapper<ZixunwentiEntity> wrapper);
	
	ZixunwentiVO selectVO(@Param("ew") Wrapper<ZixunwentiEntity> wrapper);
	
	List<ZixunwentiView> selectListView(@Param("ew") Wrapper<ZixunwentiEntity> wrapper);

	List<ZixunwentiView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunwentiEntity> wrapper);

	
	ZixunwentiView selectView(@Param("ew") Wrapper<ZixunwentiEntity> wrapper);
	

}
