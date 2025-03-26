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


import com.dao.GuoshuxinxiDao;
import com.entity.GuoshuxinxiEntity;
import com.service.GuoshuxinxiService;
import com.entity.vo.GuoshuxinxiVO;
import com.entity.view.GuoshuxinxiView;

@Service("guoshuxinxiService")
public class GuoshuxinxiServiceImpl extends ServiceImpl<GuoshuxinxiDao, GuoshuxinxiEntity> implements GuoshuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuoshuxinxiEntity> page = this.selectPage(
                new Query<GuoshuxinxiEntity>(params).getPage(),
                new EntityWrapper<GuoshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuoshuxinxiEntity> wrapper) {
		  Page<GuoshuxinxiView> page =new Query<GuoshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GuoshuxinxiVO> selectListVO(Wrapper<GuoshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuoshuxinxiVO selectVO(Wrapper<GuoshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuoshuxinxiView> selectListView(Wrapper<GuoshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuoshuxinxiView selectView(Wrapper<GuoshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
