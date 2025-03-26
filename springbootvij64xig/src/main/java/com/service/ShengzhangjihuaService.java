package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengzhangjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengzhangjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengzhangjihuaView;


/**
 * 生长计划
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ShengzhangjihuaService extends IService<ShengzhangjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengzhangjihuaVO> selectListVO(Wrapper<ShengzhangjihuaEntity> wrapper);
   	
   	ShengzhangjihuaVO selectVO(@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);
   	
   	List<ShengzhangjihuaView> selectListView(Wrapper<ShengzhangjihuaEntity> wrapper);
   	
   	ShengzhangjihuaView selectView(@Param("ew") Wrapper<ShengzhangjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengzhangjihuaEntity> wrapper);

   	

}

