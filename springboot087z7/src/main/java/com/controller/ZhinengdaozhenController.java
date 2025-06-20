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

import com.entity.ZhinengdaozhenEntity;
import com.entity.view.ZhinengdaozhenView;

import com.service.ZhinengdaozhenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 智能导诊
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
@RestController
@RequestMapping("/zhinengdaozhen")
public class ZhinengdaozhenController {
    @Autowired
    private ZhinengdaozhenService zhinengdaozhenService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhinengdaozhenEntity zhinengdaozhen,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhinengdaozhen.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			zhinengdaozhen.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhinengdaozhenEntity> ew = new EntityWrapper<ZhinengdaozhenEntity>();

		PageUtils page = zhinengdaozhenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhinengdaozhen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhinengdaozhenEntity zhinengdaozhen, 
		HttpServletRequest request){
        EntityWrapper<ZhinengdaozhenEntity> ew = new EntityWrapper<ZhinengdaozhenEntity>();

		PageUtils page = zhinengdaozhenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhinengdaozhen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhinengdaozhenEntity zhinengdaozhen){
       	EntityWrapper<ZhinengdaozhenEntity> ew = new EntityWrapper<ZhinengdaozhenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhinengdaozhen, "zhinengdaozhen")); 
        return R.ok().put("data", zhinengdaozhenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhinengdaozhenEntity zhinengdaozhen){
        EntityWrapper< ZhinengdaozhenEntity> ew = new EntityWrapper< ZhinengdaozhenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhinengdaozhen, "zhinengdaozhen")); 
		ZhinengdaozhenView zhinengdaozhenView =  zhinengdaozhenService.selectView(ew);
		return R.ok("查询智能导诊成功").put("data", zhinengdaozhenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhinengdaozhenEntity zhinengdaozhen = zhinengdaozhenService.selectById(id);
        return R.ok().put("data", zhinengdaozhen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhinengdaozhenEntity zhinengdaozhen = zhinengdaozhenService.selectById(id);
        return R.ok().put("data", zhinengdaozhen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhinengdaozhenEntity zhinengdaozhen, HttpServletRequest request){
    	zhinengdaozhen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhinengdaozhen);
        zhinengdaozhenService.insert(zhinengdaozhen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhinengdaozhenEntity zhinengdaozhen, HttpServletRequest request){
    	zhinengdaozhen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhinengdaozhen);
        zhinengdaozhenService.insert(zhinengdaozhen);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhinengdaozhenEntity zhinengdaozhen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhinengdaozhen);
        zhinengdaozhenService.updateById(zhinengdaozhen);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhinengdaozhenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
