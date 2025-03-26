package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchangxinxiView;


/**
 * 农场信息
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface NongchangxinxiService extends IService<NongchangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchangxinxiVO> selectListVO(Wrapper<NongchangxinxiEntity> wrapper);
   	
   	NongchangxinxiVO selectVO(@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);
   	
   	List<NongchangxinxiView> selectListView(Wrapper<NongchangxinxiEntity> wrapper);
   	
   	NongchangxinxiView selectView(@Param("ew") Wrapper<NongchangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchangxinxiEntity> wrapper);

   	

}

