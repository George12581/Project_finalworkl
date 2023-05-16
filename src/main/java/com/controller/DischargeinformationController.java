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

import com.entity.DischargeinformationEntity;
import com.entity.view.DischargeinformationView;

import com.service.DischargeinformationService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * dischargeinformation
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@RestController
@RequestMapping("/dischargeinformation")
public class DischargeinformationController {
    @Autowired
    private DischargeinformationService dischargeinformationService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DischargeinformationEntity dischargeinformation, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nurse")) {
			dischargeinformation.setNurseaccountnumber((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("doctor")) {
			dischargeinformation.setDoctoraccountnumber((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DischargeinformationEntity> ew = new EntityWrapper<DischargeinformationEntity>();


		PageUtils page = dischargeinformationService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dischargeinformation), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DischargeinformationEntity dischargeinformation, 
		HttpServletRequest request){
        EntityWrapper<DischargeinformationEntity> ew = new EntityWrapper<DischargeinformationEntity>();

		PageUtils page = dischargeinformationService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dischargeinformation), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DischargeinformationEntity dischargeinformation){
       	EntityWrapper<DischargeinformationEntity> ew = new EntityWrapper<DischargeinformationEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dischargeinformation, "dischargeinformation")); 
        return R.ok().put("data", dischargeinformationService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DischargeinformationEntity dischargeinformation){
        EntityWrapper< DischargeinformationEntity> ew = new EntityWrapper< DischargeinformationEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dischargeinformation, "dischargeinformation")); 
		DischargeinformationView dischargeinformationView =  dischargeinformationService.selectView(ew);
		return R.ok("查询dischargeinformation成功").put("data", dischargeinformationView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DischargeinformationEntity dischargeinformation = dischargeinformationService.selectById(id);
        return R.ok().put("data", dischargeinformation);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DischargeinformationEntity dischargeinformation = dischargeinformationService.selectById(id);
        return R.ok().put("data", dischargeinformation);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DischargeinformationEntity dischargeinformation, HttpServletRequest request){
    	dischargeinformation.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dischargeinformation);

        dischargeinformationService.insert(dischargeinformation);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DischargeinformationEntity dischargeinformation, HttpServletRequest request){
    	dischargeinformation.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dischargeinformation);

        dischargeinformationService.insert(dischargeinformation);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DischargeinformationEntity dischargeinformation, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dischargeinformation);
        dischargeinformationService.updateById(dischargeinformation);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dischargeinformationService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
