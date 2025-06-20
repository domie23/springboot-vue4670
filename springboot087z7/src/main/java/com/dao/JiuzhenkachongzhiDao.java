package com.dao;

import com.entity.JiuzhenkachongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuzhenkachongzhiVO;
import com.entity.view.JiuzhenkachongzhiView;


/**
 * 就诊卡充值
 * 
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface JiuzhenkachongzhiDao extends BaseMapper<JiuzhenkachongzhiEntity> {
	
	List<JiuzhenkachongzhiVO> selectListVO(@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);
	
	JiuzhenkachongzhiVO selectVO(@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);
	
	List<JiuzhenkachongzhiView> selectListView(@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);

	List<JiuzhenkachongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);
	
	JiuzhenkachongzhiView selectView(@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);
	

}
