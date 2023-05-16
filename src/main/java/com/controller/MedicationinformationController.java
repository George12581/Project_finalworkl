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

import com.entity.MedicationinformationEntity;
import com.entity.view.MedicationinformationView;

import com.service.MedicationinformationService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * medicationinformation
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@RestController
@RequestMapping("/medicationinformation")
public class MedicationinformationController {
    @Autowired
    private MedicationinformationService medicationinformationService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MedicationinformationEntity medicationinformation, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("doctor")) {
			medicationinformation.setDoctoraccountnumber((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MedicationinformationEntity> ew = new EntityWrapper<MedicationinformationEntity>();


		PageUtils page = medicationinformationService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, medicationinformation), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MedicationinformationEntity medicationinformation, 
		HttpServletRequest request){
        EntityWrapper<MedicationinformationEntity> ew = new EntityWrapper<MedicationinformationEntity>();

		PageUtils page = medicationinformationService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, medicationinformation), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MedicationinformationEntity medicationinformation){
       	EntityWrapper<MedicationinformationEntity> ew = new EntityWrapper<MedicationinformationEntity>();
      	ew.allEq(MPUtil.allEQMapPre( medicationinformation, "medicationinformation")); 
        return R.ok().put("data", medicationinformationService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MedicationinformationEntity medicationinformation){
        EntityWrapper< MedicationinformationEntity> ew = new EntityWrapper< MedicationinformationEntity>();
 		ew.allEq(MPUtil.allEQMapPre( medicationinformation, "medicationinformation")); 
		MedicationinformationView medicationinformationView =  medicationinformationService.selectView(ew);
		return R.ok("查询medicationinformation成功").put("data", medicationinformationView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MedicationinformationEntity medicationinformation = medicationinformationService.selectById(id);
        return R.ok().put("data", medicationinformation);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MedicationinformationEntity medicationinformation = medicationinformationService.selectById(id);
        return R.ok().put("data", medicationinformation);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MedicationinformationEntity medicationinformation, HttpServletRequest request){
    	medicationinformation.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(medicationinformation);

        medicationinformationService.insert(medicationinformation);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MedicationinformationEntity medicationinformation, HttpServletRequest request){
    	medicationinformation.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(medicationinformation);

        medicationinformationService.insert(medicationinformation);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MedicationinformationEntity medicationinformation, HttpServletRequest request){
        //ValidatorUtils.validateEntity(medicationinformation);
        medicationinformationService.updateById(medicationinformation);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        medicationinformationService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
