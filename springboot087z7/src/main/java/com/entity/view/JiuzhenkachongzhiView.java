package com.entity.view;

import com.entity.JiuzhenkachongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 就诊卡充值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
@TableName("jiuzhenkachongzhi")
public class JiuzhenkachongzhiView  extends JiuzhenkachongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuzhenkachongzhiView(){
	}
 
 	public JiuzhenkachongzhiView(JiuzhenkachongzhiEntity jiuzhenkachongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, jiuzhenkachongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
