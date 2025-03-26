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


import com.dao.GuoshuzhishiDao;
import com.entity.GuoshuzhishiEntity;
import com.service.GuoshuzhishiService;
import com.entity.vo.GuoshuzhishiVO;
import com.entity.view.GuoshuzhishiView;

@Service("guoshuzhishiService")
public class GuoshuzhishiServiceImpl extends ServiceImpl<GuoshuzhishiDao, GuoshuzhishiEntity> implements GuoshuzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuoshuzhishiEntity> page = this.selectPage(
                new Query<GuoshuzhishiEntity>(params).getPage(),
                new EntityWrapper<GuoshuzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuoshuzhishiEntity> wrapper) {
		  Page<GuoshuzhishiView> page =new Query<GuoshuzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GuoshuzhishiVO> selectListVO(Wrapper<GuoshuzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuoshuzhishiVO selectVO(Wrapper<GuoshuzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuoshuzhishiView> selectListView(Wrapper<GuoshuzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuoshuzhishiView selectView(Wrapper<GuoshuzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
