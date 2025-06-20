package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaohangfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaohangfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaohangfuwuView;


/**
 * 导航服务
 *
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface DaohangfuwuService extends IService<DaohangfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaohangfuwuVO> selectListVO(Wrapper<DaohangfuwuEntity> wrapper);
   	
   	DaohangfuwuVO selectVO(@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);
   	
   	List<DaohangfuwuView> selectListView(Wrapper<DaohangfuwuEntity> wrapper);
   	
   	DaohangfuwuView selectView(@Param("ew") Wrapper<DaohangfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaohangfuwuEntity> wrapper);
   	

}

