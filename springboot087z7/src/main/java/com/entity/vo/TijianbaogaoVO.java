package com.entity.vo;

import com.entity.TijianbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
public class TijianbaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 科室名称
	 */
	
	private String keshimingcheng;
		
	/**
	 * 科室号
	 */
	
	private String keshihao;
		
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 体检报告
	 */
	
	private String tijianbaogao;
		
	/**
	 * 诊断结果
	 */
	
	private String zhenduanjieguo;
		
	/**
	 * 诊断时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhenduanshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 就诊卡号
	 */
	
	private String jiuzhenkahao;
		
	/**
	 * 用户金额
	 */
	
	private Integer yonghujine;
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
				
	
	/**
	 * 设置：科室名称
	 */
	 
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
				
	
	/**
	 * 设置：科室号
	 */
	 
	public void setKeshihao(String keshihao) {
		this.keshihao = keshihao;
	}
	
	/**
	 * 获取：科室号
	 */
	public String getKeshihao() {
		return keshihao;
	}
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：体检报告
	 */
	 
	public void setTijianbaogao(String tijianbaogao) {
		this.tijianbaogao = tijianbaogao;
	}
	
	/**
	 * 获取：体检报告
	 */
	public String getTijianbaogao() {
		return tijianbaogao;
	}
				
	
	/**
	 * 设置：诊断结果
	 */
	 
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
				
	
	/**
	 * 设置：诊断时间
	 */
	 
	public void setZhenduanshijian(Date zhenduanshijian) {
		this.zhenduanshijian = zhenduanshijian;
	}
	
	/**
	 * 获取：诊断时间
	 */
	public Date getZhenduanshijian() {
		return zhenduanshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：用户金额
	 */
	 
	public void setYonghujine(Integer yonghujine) {
		this.yonghujine = yonghujine;
	}
	
	/**
	 * 获取：用户金额
	 */
	public Integer getYonghujine() {
		return yonghujine;
	}
			
}
