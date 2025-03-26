package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuoshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuoshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoshuxinxiView;


/**
 * 果树信息
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface GuoshuxinxiService extends IService<GuoshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuoshuxinxiVO> selectListVO(Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	GuoshuxinxiVO selectVO(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	List<GuoshuxinxiView> selectListView(Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	GuoshuxinxiView selectView(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuoshuxinxiEntity> wrapper);

   	

}

