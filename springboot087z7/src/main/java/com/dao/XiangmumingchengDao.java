package com.dao;

import com.entity.XiangmumingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmumingchengVO;
import com.entity.view.XiangmumingchengView;


/**
 * 项目名称
 * 
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface XiangmumingchengDao extends BaseMapper<XiangmumingchengEntity> {
	
	List<XiangmumingchengVO> selectListVO(@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);
	
	XiangmumingchengVO selectVO(@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);
	
	List<XiangmumingchengView> selectListView(@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);

	List<XiangmumingchengView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);
	
	XiangmumingchengView selectView(@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);
	

}
