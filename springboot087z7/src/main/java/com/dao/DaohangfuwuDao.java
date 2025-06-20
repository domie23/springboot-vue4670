package com.dao;

import com.entity.DaohangfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaohangfuwuVO;
import com.entity.view.DaohangfuwuView;


/**
 * 导航服务
 * 
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface DaohangfuwuDao extends BaseMapper<DaohangfuwuEntity> {
	
	List<DaohangfuwuVO> selectListVO(@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);
	
	DaohangfuwuVO selectVO(@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);
	
	List<DaohangfuwuView> selectListView(@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);

	List<DaohangfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);
	
	DaohangfuwuView selectView(@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);
	

}
