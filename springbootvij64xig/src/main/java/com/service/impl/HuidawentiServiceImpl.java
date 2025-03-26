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


import com.dao.HuidawentiDao;
import com.entity.HuidawentiEntity;
import com.service.HuidawentiService;
import com.entity.vo.HuidawentiVO;
import com.entity.view.HuidawentiView;

@Service("huidawentiService")
public class HuidawentiServiceImpl extends ServiceImpl<HuidawentiDao, HuidawentiEntity> implements HuidawentiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuidawentiEntity> page = this.selectPage(
                new Query<HuidawentiEntity>(params).getPage(),
                new EntityWrapper<HuidawentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuidawentiEntity> wrapper) {
		  Page<HuidawentiView> page =new Query<HuidawentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HuidawentiVO> selectListVO(Wrapper<HuidawentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuidawentiVO selectVO(Wrapper<HuidawentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuidawentiView> selectListView(Wrapper<HuidawentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuidawentiView selectView(Wrapper<HuidawentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
