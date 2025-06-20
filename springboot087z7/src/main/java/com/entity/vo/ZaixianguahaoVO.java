package com.entity.vo;

import com.entity.ZaixianguahaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 在线挂号
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
public class ZaixianguahaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室名称
	 */
	
	private String keshimingcheng;
		
	/**
	 * 科室号
	 */
	
	private String keshihao;
		
	/**
	 * 挂号费
	 */
	
	private Float jine;
		
	/**
	 * 坐诊时间
	 */
	
	private String zuozhenshijian;
		
	/**
	 * 挂号人数
	 */
	
	private Integer renshu;
		
	/**
	 * 挂号时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guahaoshijian;
		
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
	
	private Float yonghujine;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：挂号费
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：挂号费
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：坐诊时间
	 */
	 
	public void setZuozhenshijian(String zuozhenshijian) {
		this.zuozhenshijian = zuozhenshijian;
	}
	
	/**
	 * 获取：坐诊时间
	 */
	public String getZuozhenshijian() {
		return zuozhenshijian;
	}
				
	
	/**
	 * 设置：挂号人数
	 */
	 
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	
	/**
	 * 获取：挂号人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
				
	
	/**
	 * 设置：挂号时间
	 */
	 
	public void setGuahaoshijian(Date guahaoshijian) {
		this.guahaoshijian = guahaoshijian;
	}
	
	/**
	 * 获取：挂号时间
	 */
	public Date getGuahaoshijian() {
		return guahaoshijian;
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
	 
	public void setYonghujine(Float yonghujine) {
		this.yonghujine = yonghujine;
	}
	
	/**
	 * 获取：用户金额
	 */
	public Float getYonghujine() {
		return yonghujine;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
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
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
