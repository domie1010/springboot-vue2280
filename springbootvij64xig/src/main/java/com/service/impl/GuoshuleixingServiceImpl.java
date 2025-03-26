package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuoshuleixingDao;
import com.entity.GuoshuleixingEntity;
import com.service.GuoshuleixingService;
import com.entity.vo.GuoshuleixingVO;
import com.entity.view.GuoshuleixingView;

@Service("guoshuleixingService")
public class GuoshuleixingServiceImpl extends ServiceImpl<GuoshuleixingDao, GuoshuleixingEntity> implements GuoshuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuoshuleixingEntity> page = this.selectPage(
                new Query<GuoshuleixingEntity>(params).getPage(),
                new EntityWrapper<GuoshuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuoshuleixingEntity> wrapper) {
		  Page<GuoshuleixingView> page =new Query<GuoshuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GuoshuleixingVO> selectListVO(Wrapper<GuoshuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuoshuleixingVO selectVO(Wrapper<GuoshuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuoshuleixingView> selectListView(Wrapper<GuoshuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuoshuleixingView selectView(Wrapper<GuoshuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
