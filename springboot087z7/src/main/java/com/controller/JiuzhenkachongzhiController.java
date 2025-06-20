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

import com.entity.JiuzhenkachongzhiEntity;
import com.entity.view.JiuzhenkachongzhiView;

import com.service.JiuzhenkachongzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 就诊卡充值
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
@RestController
@RequestMapping("/jiuzhenkachongzhi")
public class JiuzhenkachongzhiController {
    @Autowired
    private JiuzhenkachongzhiService jiuzhenkachongzhiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiuzhenkachongzhiEntity jiuzhenkachongzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiuzhenkachongzhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiuzhenkachongzhiEntity> ew = new EntityWrapper<JiuzhenkachongzhiEntity>();

		PageUtils page = jiuzhenkachongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuzhenkachongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiuzhenkachongzhiEntity jiuzhenkachongzhi, 
		HttpServletRequest request){
        EntityWrapper<JiuzhenkachongzhiEntity> ew = new EntityWrapper<JiuzhenkachongzhiEntity>();

		PageUtils page = jiuzhenkachongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuzhenkachongzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiuzhenkachongzhiEntity jiuzhenkachongzhi){
       	EntityWrapper<JiuzhenkachongzhiEntity> ew = new EntityWrapper<JiuzhenkachongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiuzhenkachongzhi, "jiuzhenkachongzhi")); 
        return R.ok().put("data", jiuzhenkachongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiuzhenkachongzhiEntity jiuzhenkachongzhi){
        EntityWrapper< JiuzhenkachongzhiEntity> ew = new EntityWrapper< JiuzhenkachongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiuzhenkachongzhi, "jiuzhenkachongzhi")); 
		JiuzhenkachongzhiView jiuzhenkachongzhiView =  jiuzhenkachongzhiService.selectView(ew);
		return R.ok("查询就诊卡充值成功").put("data", jiuzhenkachongzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiuzhenkachongzhiEntity jiuzhenkachongzhi = jiuzhenkachongzhiService.selectById(id);
        return R.ok().put("data", jiuzhenkachongzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiuzhenkachongzhiEntity jiuzhenkachongzhi = jiuzhenkachongzhiService.selectById(id);
        return R.ok().put("data", jiuzhenkachongzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiuzhenkachongzhiEntity jiuzhenkachongzhi, HttpServletRequest request){
    	jiuzhenkachongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuzhenkachongzhi);
        jiuzhenkachongzhiService.insert(jiuzhenkachongzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiuzhenkachongzhiEntity jiuzhenkachongzhi, HttpServletRequest request){
    	jiuzhenkachongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuzhenkachongzhi);
        jiuzhenkachongzhiService.insert(jiuzhenkachongzhi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiuzhenkachongzhiEntity jiuzhenkachongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuzhenkachongzhi);
        jiuzhenkachongzhiService.updateById(jiuzhenkachongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiuzhenkachongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
