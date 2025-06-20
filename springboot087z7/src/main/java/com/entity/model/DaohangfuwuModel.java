package com.entity.model;

import com.entity.DaohangfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 导航服务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
public class DaohangfuwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 出发地
	 */
	
	private String chufadi;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 交通方式
	 */
	
	private String jiaotongfangshi;
		
	/**
	 * 用时
	 */
	
	private String yongshi;
				
	
	/**
	 * 设置：出发地
	 */
	 
	public void setChufadi(String chufadi) {
		this.chufadi = chufadi;
	}
	
	/**
	 * 获取：出发地
	 */
	public String getChufadi() {
		return chufadi;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
				
	
	/**
	 * 设置：交通方式
	 */
	 
	public void setJiaotongfangshi(String jiaotongfangshi) {
		this.jiaotongfangshi = jiaotongfangshi;
	}
	
	/**
	 * 获取：交通方式
	 */
	public String getJiaotongfangshi() {
		return jiaotongfangshi;
	}
				
	
	/**
	 * 设置：用时
	 */
	 
	public void setYongshi(String yongshi) {
		this.yongshi = yongshi;
	}
	
	/**
	 * 获取：用时
	 */
	public String getYongshi() {
		return yongshi;
	}
			
}
