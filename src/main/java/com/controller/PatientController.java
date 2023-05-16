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

import com.entity.PatientEntity;
import com.entity.view.PatientView;

import com.service.PatientService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * patient
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PatientEntity patient, 
		HttpServletRequest request){

        EntityWrapper<PatientEntity> ew = new EntityWrapper<PatientEntity>();


		PageUtils page = patientService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, patient), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PatientEntity patient, 
		HttpServletRequest request){
        EntityWrapper<PatientEntity> ew = new EntityWrapper<PatientEntity>();

		PageUtils page = patientService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, patient), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PatientEntity patient){
       	EntityWrapper<PatientEntity> ew = new EntityWrapper<PatientEntity>();
      	ew.allEq(MPUtil.allEQMapPre( patient, "patient")); 
        return R.ok().put("data", patientService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PatientEntity patient){
        EntityWrapper< PatientEntity> ew = new EntityWrapper< PatientEntity>();
 		ew.allEq(MPUtil.allEQMapPre( patient, "patient")); 
		PatientView patientView =  patientService.selectView(ew);
		return R.ok("查询patient成功").put("data", patientView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PatientEntity patient = patientService.selectById(id);
        return R.ok().put("data", patient);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PatientEntity patient = patientService.selectById(id);
        return R.ok().put("data", patient);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PatientEntity patient, HttpServletRequest request){
    	patient.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(patient);

        patientService.insert(patient);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PatientEntity patient, HttpServletRequest request){
    	patient.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(patient);

        patientService.insert(patient);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PatientEntity patient, HttpServletRequest request){
        //ValidatorUtils.validateEntity(patient);
        patientService.updateById(patient);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        patientService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
