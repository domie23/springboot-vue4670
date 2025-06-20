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


import com.dao.DaohangfuwuDao;
import com.entity.DaohangfuwuEntity;
import com.service.DaohangfuwuService;
import com.entity.vo.DaohangfuwuVO;
import com.entity.view.DaohangfuwuView;

@Service("daohangfuwuService")
public class DaohangfuwuServiceImpl extends ServiceImpl<DaohangfuwuDao, DaohangfuwuEntity> implements DaohangfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaohangfuwuEntity> page = this.selectPage(
                new Query<DaohangfuwuEntity>(params).getPage(),
                new EntityWrapper<DaohangfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaohangfuwuEntity> wrapper) {
		  Page<DaohangfuwuView> page =new Query<DaohangfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaohangfuwuVO> selectListVO(Wrapper<DaohangfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaohangfuwuVO selectVO(Wrapper<DaohangfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaohangfuwuView> selectListView(Wrapper<DaohangfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaohangfuwuView selectView(Wrapper<DaohangfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
