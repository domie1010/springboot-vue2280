package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuidawentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuidawentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuidawentiView;


/**
 * 回答问题
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface HuidawentiService extends IService<HuidawentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuidawentiVO> selectListVO(Wrapper<HuidawentiEntity> wrapper);
   	
   	HuidawentiVO selectVO(@Param("ew") Wrapper<HuidawentiEntity> wrapper);
   	
   	List<HuidawentiView> selectListView(Wrapper<HuidawentiEntity> wrapper);
   	
   	HuidawentiView selectView(@Param("ew") Wrapper<HuidawentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuidawentiEntity> wrapper);

   	

}

