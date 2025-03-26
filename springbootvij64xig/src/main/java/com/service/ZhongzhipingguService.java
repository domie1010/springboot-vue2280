package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhipingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhipingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhipingguView;


/**
 * 种植评估
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ZhongzhipingguService extends IService<ZhongzhipingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhipingguVO> selectListVO(Wrapper<ZhongzhipingguEntity> wrapper);
   	
   	ZhongzhipingguVO selectVO(@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);
   	
   	List<ZhongzhipingguView> selectListView(Wrapper<ZhongzhipingguEntity> wrapper);
   	
   	ZhongzhipingguView selectView(@Param("ew") Wrapper<ZhongzhipingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhipingguEntity> wrapper);

   	

}

