package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhinengdaozhenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhinengdaozhenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhinengdaozhenView;


/**
 * 智能导诊
 *
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface ZhinengdaozhenService extends IService<ZhinengdaozhenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhinengdaozhenVO> selectListVO(Wrapper<ZhinengdaozhenEntity> wrapper);
   	
   	ZhinengdaozhenVO selectVO(@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);
   	
   	List<ZhinengdaozhenView> selectListView(Wrapper<ZhinengdaozhenEntity> wrapper);
   	
   	ZhinengdaozhenView selectView(@Param("ew") Wrapper<ZhinengdaozhenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhinengdaozhenEntity> wrapper);
   	

}

