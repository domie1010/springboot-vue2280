package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchangzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchangzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchangzhuView;


/**
 * 农场主
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:31
 */
public interface NongchangzhuService extends IService<NongchangzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchangzhuVO> selectListVO(Wrapper<NongchangzhuEntity> wrapper);
   	
   	NongchangzhuVO selectVO(@Param("ew") Wrapper<NongchangzhuEntity> wrapper);
   	
   	List<NongchangzhuView> selectListView(Wrapper<NongchangzhuEntity> wrapper);
   	
   	NongchangzhuView selectView(@Param("ew") Wrapper<NongchangzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchangzhuEntity> wrapper);

   	

}

