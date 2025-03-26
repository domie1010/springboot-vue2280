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


import com.dao.ZixunwentiDao;
import com.entity.ZixunwentiEntity;
import com.service.ZixunwentiService;
import com.entity.vo.ZixunwentiVO;
import com.entity.view.ZixunwentiView;

@Service("zixunwentiService")
public class ZixunwentiServiceImpl extends ServiceImpl<ZixunwentiDao, ZixunwentiEntity> implements ZixunwentiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunwentiEntity> page = this.selectPage(
                new Query<ZixunwentiEntity>(params).getPage(),
                new EntityWrapper<ZixunwentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunwentiEntity> wrapper) {
		  Page<ZixunwentiView> page =new Query<ZixunwentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZixunwentiVO> selectListVO(Wrapper<ZixunwentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunwentiVO selectVO(Wrapper<ZixunwentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunwentiView> selectListView(Wrapper<ZixunwentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunwentiView selectView(Wrapper<ZixunwentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
