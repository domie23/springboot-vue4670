package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuzhenkachongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuzhenkachongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuzhenkachongzhiView;


/**
 * 就诊卡充值
 *
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public interface JiuzhenkachongzhiService extends IService<JiuzhenkachongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuzhenkachongzhiVO> selectListVO(Wrapper<JiuzhenkachongzhiEntity> wrapper);
   	
   	JiuzhenkachongzhiVO selectVO(@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);
   	
   	List<JiuzhenkachongzhiView> selectListView(Wrapper<JiuzhenkachongzhiEntity> wrapper);
   	
   	JiuzhenkachongzhiView selectView(@Param("ew") Wrapper<JiuzhenkachongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuzhenkachongzhiEntity> wrapper);
   	

}

