package com.entity.vo;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
public class YonghuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 就诊卡号
	 */
	
	private String jiuzhenkahao;
		
	/**
	 * 金额
	 */
	
	private Float jine;
		
	/**
	 * 症状描述
	 */
	
	private String zhengzhuangmiaoshu;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：就诊卡号
	 */
	 
	public void setJiuzhenkahao(String jiuzhenkahao) {
		this.jiuzhenkahao = jiuzhenkahao;
	}
	
	/**
	 * 获取：就诊卡号
	 */
	public String getJiuzhenkahao() {
		return jiuzhenkahao;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：症状描述
	 */
	 
	public void setZhengzhuangmiaoshu(String zhengzhuangmiaoshu) {
		this.zhengzhuangmiaoshu = zhengzhuangmiaoshu;
	}
	
	/**
	 * 获取：症状描述
	 */
	public String getZhengzhuangmiaoshu() {
		return zhengzhuangmiaoshu;
	}
			
}
