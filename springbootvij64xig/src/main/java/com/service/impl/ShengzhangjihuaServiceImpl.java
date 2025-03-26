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


import com.dao.ShengzhangjihuaDao;
import com.entity.ShengzhangjihuaEntity;
import com.service.ShengzhangjihuaService;
import com.entity.vo.ShengzhangjihuaVO;
import com.entity.view.ShengzhangjihuaView;

@Service("shengzhangjihuaService")
public class ShengzhangjihuaServiceImpl extends ServiceImpl<ShengzhangjihuaDao, ShengzhangjihuaEntity> implements ShengzhangjihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengzhangjihuaEntity> page = this.selectPage(
                new Query<ShengzhangjihuaEntity>(params).getPage(),
                new EntityWrapper<ShengzhangjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengzhangjihuaEntity> wrapper) {
		  Page<ShengzhangjihuaView> page =new Query<ShengzhangjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShengzhangjihuaVO> selectListVO(Wrapper<ShengzhangjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengzhangjihuaVO selectVO(Wrapper<ShengzhangjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengzhangjihuaView> selectListView(Wrapper<ShengzhangjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengzhangjihuaView selectView(Wrapper<ShengzhangjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
