package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhixinxiView;


/**
 * 种植信息
 *
 * @author 
 * @email 
 * @date 2024-02-13 14:34:32
 */
public interface ZhongzhixinxiService extends IService<ZhongzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhixinxiVO> selectListVO(Wrapper<ZhongzhixinxiEntity> wrapper);
   	
   	ZhongzhixinxiVO selectVO(@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);
   	
   	List<ZhongzhixinxiView> selectListView(Wrapper<ZhongzhixinxiEntity> wrapper);
   	
   	ZhongzhixinxiView selectView(@Param("ew") Wrapper<ZhongzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhixinxiEntity> wrapper);

   	

}

