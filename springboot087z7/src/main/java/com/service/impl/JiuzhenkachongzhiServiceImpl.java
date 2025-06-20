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


import com.dao.JiuzhenkachongzhiDao;
import com.entity.JiuzhenkachongzhiEntity;
import com.service.JiuzhenkachongzhiService;
import com.entity.vo.JiuzhenkachongzhiVO;
import com.entity.view.JiuzhenkachongzhiView;

@Service("jiuzhenkachongzhiService")
public class JiuzhenkachongzhiServiceImpl extends ServiceImpl<JiuzhenkachongzhiDao, JiuzhenkachongzhiEntity> implements JiuzhenkachongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuzhenkachongzhiEntity> page = this.selectPage(
                new Query<JiuzhenkachongzhiEntity>(params).getPage(),
                new EntityWrapper<JiuzhenkachongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuzhenkachongzhiEntity> wrapper) {
		  Page<JiuzhenkachongzhiView> page =new Query<JiuzhenkachongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuzhenkachongzhiVO> selectListVO(Wrapper<JiuzhenkachongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuzhenkachongzhiVO selectVO(Wrapper<JiuzhenkachongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuzhenkachongzhiView> selectListView(Wrapper<JiuzhenkachongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuzhenkachongzhiView selectView(Wrapper<JiuzhenkachongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
