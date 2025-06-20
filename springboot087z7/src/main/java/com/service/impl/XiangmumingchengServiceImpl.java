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


import com.dao.XiangmumingchengDao;
import com.entity.XiangmumingchengEntity;
import com.service.XiangmumingchengService;
import com.entity.vo.XiangmumingchengVO;
import com.entity.view.XiangmumingchengView;

@Service("xiangmumingchengService")
public class XiangmumingchengServiceImpl extends ServiceImpl<XiangmumingchengDao, XiangmumingchengEntity> implements XiangmumingchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmumingchengEntity> page = this.selectPage(
                new Query<XiangmumingchengEntity>(params).getPage(),
                new EntityWrapper<XiangmumingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmumingchengEntity> wrapper) {
		  Page<XiangmumingchengView> page =new Query<XiangmumingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmumingchengVO> selectListVO(Wrapper<XiangmumingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmumingchengVO selectVO(Wrapper<XiangmumingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmumingchengView> selectListView(Wrapper<XiangmumingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmumingchengView selectView(Wrapper<XiangmumingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
