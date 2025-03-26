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


import com.dao.ZhongzhipingguDao;
import com.entity.ZhongzhipingguEntity;
import com.service.ZhongzhipingguService;
import com.entity.vo.ZhongzhipingguVO;
import com.entity.view.ZhongzhipingguView;

@Service("zhongzhipingguService")
public class ZhongzhipingguServiceImpl extends ServiceImpl<ZhongzhipingguDao, ZhongzhipingguEntity> implements ZhongzhipingguService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhipingguEntity> page = this.selectPage(
                new Query<ZhongzhipingguEntity>(params).getPage(),
                new EntityWrapper<ZhongzhipingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhipingguEntity> wrapper) {
		  Page<ZhongzhipingguView> page =new Query<ZhongzhipingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhongzhipingguVO> selectListVO(Wrapper<ZhongzhipingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhipingguVO selectVO(Wrapper<ZhongzhipingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhipingguView> selectListView(Wrapper<ZhongzhipingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhipingguView selectView(Wrapper<ZhongzhipingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
