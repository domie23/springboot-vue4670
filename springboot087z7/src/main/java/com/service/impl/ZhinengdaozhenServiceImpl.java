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


import com.dao.ZhinengdaozhenDao;
import com.entity.ZhinengdaozhenEntity;
import com.service.ZhinengdaozhenService;
import com.entity.vo.ZhinengdaozhenVO;
import com.entity.view.ZhinengdaozhenView;

@Service("zhinengdaozhenService")
public class ZhinengdaozhenServiceImpl extends ServiceImpl<ZhinengdaozhenDao, ZhinengdaozhenEntity> implements ZhinengdaozhenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhinengdaozhenEntity> page = this.selectPage(
                new Query<ZhinengdaozhenEntity>(params).getPage(),
                new EntityWrapper<ZhinengdaozhenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhinengdaozhenEntity> wrapper) {
		  Page<ZhinengdaozhenView> page =new Query<ZhinengdaozhenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhinengdaozhenVO> selectListVO(Wrapper<ZhinengdaozhenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhinengdaozhenVO selectVO(Wrapper<ZhinengdaozhenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhinengdaozhenView> selectListView(Wrapper<ZhinengdaozhenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhinengdaozhenView selectView(Wrapper<ZhinengdaozhenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
