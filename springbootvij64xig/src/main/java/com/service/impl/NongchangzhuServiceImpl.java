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


import com.dao.NongchangzhuDao;
import com.entity.NongchangzhuEntity;
import com.service.NongchangzhuService;
import com.entity.vo.NongchangzhuVO;
import com.entity.view.NongchangzhuView;

@Service("nongchangzhuService")
public class NongchangzhuServiceImpl extends ServiceImpl<NongchangzhuDao, NongchangzhuEntity> implements NongchangzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchangzhuEntity> page = this.selectPage(
                new Query<NongchangzhuEntity>(params).getPage(),
                new EntityWrapper<NongchangzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchangzhuEntity> wrapper) {
		  Page<NongchangzhuView> page =new Query<NongchangzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<NongchangzhuVO> selectListVO(Wrapper<NongchangzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchangzhuVO selectVO(Wrapper<NongchangzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchangzhuView> selectListView(Wrapper<NongchangzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchangzhuView selectView(Wrapper<NongchangzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
