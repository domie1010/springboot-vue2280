package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunwentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunwentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunwentiView;


/**
 * 咨询问题
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ZixunwentiService extends IService<ZixunwentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunwentiVO> selectListVO(Wrapper<ZixunwentiEntity> wrapper);
   	
   	ZixunwentiVO selectVO(@Param("ew") Wrapper<ZixunwentiEntity> wrapper);
   	
   	List<ZixunwentiView> selectListView(Wrapper<ZixunwentiEntity> wrapper);
   	
   	ZixunwentiView selectView(@Param("ew") Wrapper<ZixunwentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunwentiEntity> wrapper);

   	

}

