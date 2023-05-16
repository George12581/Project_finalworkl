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

import com.entity.DoctorEntity;
import com.entity.view.DoctorView;

import com.service.DoctorService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * doctor
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		DoctorEntity u = doctorService.selectOne(new EntityWrapper<DoctorEntity>().eq("doctoraccountnumber", username));
		if(u==null || !u.getPassword().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(u.getId(), username,"doctor",  "doctor" );
		return R.ok().put("token", token);
	}

	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody DoctorEntity doctor){
    	//ValidatorUtils.validateEntity(doctor);
    	DoctorEntity u = doctorService.selectOne(new EntityWrapper<DoctorEntity>().eq("doctoraccountnumber", doctor.getDoctoraccountnumber()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		doctor.setId(uId);
        doctorService.insert(doctor);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        DoctorEntity u = doctorService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	DoctorEntity u = doctorService.selectOne(new EntityWrapper<DoctorEntity>().eq("doctoraccountnumber", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
    	u.setPassword("123456");
        doctorService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DoctorEntity doctor, 
		HttpServletRequest request){

        EntityWrapper<DoctorEntity> ew = new EntityWrapper<DoctorEntity>();


		PageUtils page = doctorService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, doctor), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DoctorEntity doctor, 
		HttpServletRequest request){
        EntityWrapper<DoctorEntity> ew = new EntityWrapper<DoctorEntity>();

		PageUtils page = doctorService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, doctor), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DoctorEntity doctor){
       	EntityWrapper<DoctorEntity> ew = new EntityWrapper<DoctorEntity>();
      	ew.allEq(MPUtil.allEQMapPre( doctor, "doctor")); 
        return R.ok().put("data", doctorService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DoctorEntity doctor){
        EntityWrapper< DoctorEntity> ew = new EntityWrapper< DoctorEntity>();
 		ew.allEq(MPUtil.allEQMapPre( doctor, "doctor")); 
		DoctorView doctorView =  doctorService.selectView(ew);
		return R.ok("查询doctor成功").put("data", doctorView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DoctorEntity doctor = doctorService.selectById(id);
		doctor.setClicknum(doctor.getClicknum()+1);
		doctor.setClicktime(new Date());
		doctorService.updateById(doctor);
        return R.ok().put("data", doctor);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DoctorEntity doctor = doctorService.selectById(id);
		doctor.setClicknum(doctor.getClicknum()+1);
		doctor.setClicktime(new Date());
		doctorService.updateById(doctor);
        return R.ok().put("data", doctor);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DoctorEntity doctor, HttpServletRequest request){
    	doctor.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(doctor);
    	DoctorEntity u = doctorService.selectOne(new EntityWrapper<DoctorEntity>().eq("doctoraccountnumber", doctor.getDoctoraccountnumber()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		doctor.setId(new Date().getTime());
        doctorService.insert(doctor);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DoctorEntity doctor, HttpServletRequest request){
    	doctor.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(doctor);
    	DoctorEntity u = doctorService.selectOne(new EntityWrapper<DoctorEntity>().eq("doctoraccountnumber", doctor.getDoctoraccountnumber()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		doctor.setId(new Date().getTime());
        doctorService.insert(doctor);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DoctorEntity doctor, HttpServletRequest request){
        //ValidatorUtils.validateEntity(doctor);
        doctorService.updateById(doctor);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        doctorService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DoctorEntity doctor, HttpServletRequest request,String pre){
        EntityWrapper<DoctorEntity> ew = new EntityWrapper<DoctorEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = doctorService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, doctor), params), params));
        return R.ok().put("data", page);
    }









}
