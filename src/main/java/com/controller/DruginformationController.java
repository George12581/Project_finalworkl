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
import java.io.IOException;

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

import com.entity.DruginformationEntity;
import com.entity.view.DruginformationView;

import com.service.DruginformationService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * druginformation
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@RestController
@RequestMapping("/druginformation")
public class DruginformationController {
    @Autowired
    private DruginformationService druginformationService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DruginformationEntity druginformation, 
		HttpServletRequest request){

        EntityWrapper<DruginformationEntity> ew = new EntityWrapper<DruginformationEntity>();


		PageUtils page = druginformationService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, druginformation), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DruginformationEntity druginformation, 
		HttpServletRequest request){
        EntityWrapper<DruginformationEntity> ew = new EntityWrapper<DruginformationEntity>();

		PageUtils page = druginformationService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, druginformation), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DruginformationEntity druginformation){
       	EntityWrapper<DruginformationEntity> ew = new EntityWrapper<DruginformationEntity>();
      	ew.allEq(MPUtil.allEQMapPre( druginformation, "druginformation")); 
        return R.ok().put("data", druginformationService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DruginformationEntity druginformation){
        EntityWrapper< DruginformationEntity> ew = new EntityWrapper< DruginformationEntity>();
 		ew.allEq(MPUtil.allEQMapPre( druginformation, "druginformation")); 
		DruginformationView druginformationView =  druginformationService.selectView(ew);
		return R.ok("查询druginformation成功").put("data", druginformationView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DruginformationEntity druginformation = druginformationService.selectById(id);
        return R.ok().put("data", druginformation);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DruginformationEntity druginformation = druginformationService.selectById(id);
        return R.ok().put("data", druginformation);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DruginformationEntity druginformation, HttpServletRequest request){
    	druginformation.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(druginformation);

        druginformationService.insert(druginformation);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DruginformationEntity druginformation, HttpServletRequest request){
    	druginformation.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(druginformation);

        druginformationService.insert(druginformation);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DruginformationEntity druginformation, HttpServletRequest request){
        //ValidatorUtils.validateEntity(druginformation);
        druginformationService.updateById(druginformation);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        druginformationService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
