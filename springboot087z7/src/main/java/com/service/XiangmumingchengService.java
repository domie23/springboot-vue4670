package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmumingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmumingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmumingchengView;


/**
 * 项目名称
 *
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface XiangmumingchengService extends IService<XiangmumingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmumingchengVO> selectListVO(Wrapper<XiangmumingchengEntity> wrapper);
   	
   	XiangmumingchengVO selectVO(@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);
   	
   	List<XiangmumingchengView> selectListView(Wrapper<XiangmumingchengEntity> wrapper);
   	
   	XiangmumingchengView selectView(@Param("ew") Wrapper<XiangmumingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmumingchengEntity> wrapper);
   	

}

