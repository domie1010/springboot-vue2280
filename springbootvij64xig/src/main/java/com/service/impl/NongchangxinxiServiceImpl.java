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


import com.dao.NongchangxinxiDao;
import com.entity.NongchangxinxiEntity;
import com.service.NongchangxinxiService;
import com.entity.vo.NongchangxinxiVO;
import com.entity.view.NongchangxinxiView;

@Service("nongchangxinxiService")
public class NongchangxinxiServiceImpl extends ServiceImpl<NongchangxinxiDao, NongchangxinxiEntity> implements NongchangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchangxinxiEntity> page = this.selectPage(
                new Query<NongchangxinxiEntity>(params).getPage(),
                new EntityWrapper<NongchangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchangxinxiEntity> wrapper) {
		  Page<NongchangxinxiView> page =new Query<NongchangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<NongchangxinxiVO> selectListVO(Wrapper<NongchangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchangxinxiVO selectVO(Wrapper<NongchangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchangxinxiView> selectListView(Wrapper<NongchangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchangxinxiView selectView(Wrapper<NongchangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
