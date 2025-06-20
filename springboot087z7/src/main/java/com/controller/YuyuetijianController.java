package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuyuetijianEntity;
import com.entity.view.YuyuetijianView;

import com.service.YuyuetijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 预约体检
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
@RestController
@RequestMapping("/yuyuetijian")
public class YuyuetijianController {
    @Autowired
    private YuyuetijianService yuyuetijianService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyuetijianEntity yuyuetijian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			yuyuetijian.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yuyuetijian.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyuetijianEntity> ew = new EntityWrapper<YuyuetijianEntity>();

		PageUtils page = yuyuetijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuetijian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyuetijianEntity yuyuetijian, 
		HttpServletRequest request){
        EntityWrapper<YuyuetijianEntity> ew = new EntityWrapper<YuyuetijianEntity>();

		PageUtils page = yuyuetijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuetijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyuetijianEntity yuyuetijian){
       	EntityWrapper<YuyuetijianEntity> ew = new EntityWrapper<YuyuetijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyuetijian, "yuyuetijian")); 
        return R.ok().put("data", yuyuetijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyuetijianEntity yuyuetijian){
        EntityWrapper< YuyuetijianEntity> ew = new EntityWrapper< YuyuetijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyuetijian, "yuyuetijian")); 
		YuyuetijianView yuyuetijianView =  yuyuetijianService.selectView(ew);
		return R.ok("查询预约体检成功").put("data", yuyuetijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyuetijianEntity yuyuetijian = yuyuetijianService.selectById(id);
        return R.ok().put("data", yuyuetijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyuetijianEntity yuyuetijian = yuyuetijianService.selectById(id);
        return R.ok().put("data", yuyuetijian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyuetijianEntity yuyuetijian, HttpServletRequest request){
    	yuyuetijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuetijian);
        yuyuetijianService.insert(yuyuetijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyuetijianEntity yuyuetijian, HttpServletRequest request){
    	yuyuetijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuetijian);
        yuyuetijianService.insert(yuyuetijian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyuetijianEntity yuyuetijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyuetijian);
        yuyuetijianService.updateById(yuyuetijian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyuetijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
