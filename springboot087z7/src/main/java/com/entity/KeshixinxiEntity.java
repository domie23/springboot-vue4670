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
 * 科室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
@TableName("keshixinxi")
public class KeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeshixinxiEntity() {
		
	}
	
	public KeshixinxiEntity(T t) {
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
	 * 科室号
	 */
					
	private String keshihao;
	
	/**
	 * 科室分类
	 */
					
	private String keshifenlei;
	
	/**
	 * 科室名称
	 */
					
	private String keshimingcheng;
	
	/**
	 * 科室地址
	 */
					
	private String keshidizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 可挂号人数量
	 */
					
	private Integer renshu;
	
	/**
	 * 坐诊时间
	 */
					
	private String zuozhenshijian;
	
	/**
	 * 挂号费
	 */
					
	private Integer jine;
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：可挂号人数量
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：可挂号人数量
	 */
	public Integer getRenshu() {
		return renshu;
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
	 * 设置：挂号费
	 */
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	/**
	 * 获取：挂号费
	 */
	public Integer getJine() {
		return jine;
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

}
