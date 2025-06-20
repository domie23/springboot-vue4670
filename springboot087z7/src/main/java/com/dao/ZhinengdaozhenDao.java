package com.dao;

import com.entity.ZhinengdaozhenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhinengdaozhenVO;
import com.entity.view.ZhinengdaozhenView;


/**
 * 智能导诊
 * 
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface ZhinengdaozhenDao extends BaseMapper<ZhinengdaozhenEntity> {
	
	List<ZhinengdaozhenVO> selectListVO(@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);
	
	ZhinengdaozhenVO selectVO(@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);
	
	List<ZhinengdaozhenView> selectListView(@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);

	List<ZhinengdaozhenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);
	
	ZhinengdaozhenView selectView(@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);
	

}
