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


import com.dao.ZhongzhixinxiDao;
import com.entity.ZhongzhixinxiEntity;
import com.service.ZhongzhixinxiService;
import com.entity.vo.ZhongzhixinxiVO;
import com.entity.view.ZhongzhixinxiView;

@Service("zhongzhixinxiService")
public class ZhongzhixinxiServiceImpl extends ServiceImpl<ZhongzhixinxiDao, ZhongzhixinxiEntity> implements ZhongzhixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhixinxiEntity> page = this.selectPage(
                new Query<ZhongzhixinxiEntity>(params).getPage(),
                new EntityWrapper<ZhongzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhixinxiEntity> wrapper) {
		  Page<ZhongzhixinxiView> page =new Query<ZhongzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhongzhixinxiVO> selectListVO(Wrapper<ZhongzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhixinxiVO selectVO(Wrapper<ZhongzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhixinxiView> selectListView(Wrapper<ZhongzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhixinxiView selectView(Wrapper<ZhongzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
