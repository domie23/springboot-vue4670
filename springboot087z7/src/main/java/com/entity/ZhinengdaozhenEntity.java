package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 智能导诊
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
@TableName("zhinengdaozhen")
public class ZhinengdaozhenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhinengdaozhenEntity() {
		
	}
	
	public ZhinengdaozhenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 导诊编号
	 */
					
	private String daozhenbianhao;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 就诊卡号
	 */
					
	private String jiuzhenkahao;
	
	/**
	 * 症状描述
	 */
					
	private String zhengzhuangmiaoshu;
	
	/**
	 * 推荐医生
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
	 * 科室号
	 */
					
	private String keshihao;
	
	/**
	 * 科室名称
	 */
					
	private String keshimingcheng;
	
	/**
	 * 科室分类
	 */
					
	private String keshifenlei;
	
	/**
	 * 科室地址
	 */
					
	private String keshidizhi;
	
	/**
	 * 推荐时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tuijianshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：导诊编号
	 */
	public void setDaozhenbianhao(String daozhenbianhao) {
		this.daozhenbianhao = daozhenbianhao;
	}
	/**
	 * 获取：导诊编号
	 */
	public String getDaozhenbianhao() {
		return daozhenbianhao;
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
	/**
	 * 设置：推荐医生
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：推荐医生
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
	 * 设置：科室分类
	 */
	public void setKeshifenlei(String keshifenlei) {
		this.keshifenlei = keshifenlei;
	}
	/**
	 * 获取：科室分类
	 */
	public String getKeshifenlei() {
		return keshifenlei;
	}
	/**
	 * 设置：科室地址
	 */
	public void setKeshidizhi(String keshidizhi) {
		this.keshidizhi = keshidizhi;
	}
	/**
	 * 获取：科室地址
	 */
	public String getKeshidizhi() {
		return keshidizhi;
	}
	/**
	 * 设置：推荐时间
	 */
	public void setTuijianshijian(Date tuijianshijian) {
		this.tuijianshijian = tuijianshijian;
	}
	/**
	 * 获取：推荐时间
	 */
	public Date getTuijianshijian() {
		return tuijianshijian;
	}

}
