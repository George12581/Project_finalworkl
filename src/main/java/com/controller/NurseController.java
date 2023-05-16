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

import com.entity.NurseEntity;
import com.entity.view.NurseView;

import com.service.NurseService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * nurse
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@RestController
@RequestMapping("/nurse")
public class NurseController {
    @Autowired
    private NurseService nurseService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		NurseEntity u = nurseService.selectOne(new EntityWrapper<NurseEntity>().eq("nurseaccountnumber", username));
		if(u==null || !u.getPassword().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(u.getId(), username,"nurse",  "nurse" );
		return R.ok().put("token", token);
	}

	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody NurseEntity nurse){
    	//ValidatorUtils.validateEntity(nurse);
    	NurseEntity u = nurseService.selectOne(new EntityWrapper<NurseEntity>().eq("nurseaccountnumber", nurse.getNurseaccountnumber()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		nurse.setId(uId);
        nurseService.insert(nurse);
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
        NurseEntity u = nurseService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	NurseEntity u = nurseService.selectOne(new EntityWrapper<NurseEntity>().eq("nurseaccountnumber", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
    	u.setPassword("123456");
        nurseService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NurseEntity nurse, 
		HttpServletRequest request){

        EntityWrapper<NurseEntity> ew = new EntityWrapper<NurseEntity>();


		PageUtils page = nurseService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nurse), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NurseEntity nurse, 
		HttpServletRequest request){
        EntityWrapper<NurseEntity> ew = new EntityWrapper<NurseEntity>();

		PageUtils page = nurseService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nurse), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NurseEntity nurse){
       	EntityWrapper<NurseEntity> ew = new EntityWrapper<NurseEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nurse, "nurse")); 
        return R.ok().put("data", nurseService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NurseEntity nurse){
        EntityWrapper< NurseEntity> ew = new EntityWrapper< NurseEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nurse, "nurse")); 
		NurseView nurseView =  nurseService.selectView(ew);
		return R.ok("查询nurse成功").put("data", nurseView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NurseEntity nurse = nurseService.selectById(id);
		nurse.setClicknum(nurse.getClicknum()+1);
		nurse.setClicktime(new Date());
		nurseService.updateById(nurse);
        return R.ok().put("data", nurse);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NurseEntity nurse = nurseService.selectById(id);
		nurse.setClicknum(nurse.getClicknum()+1);
		nurse.setClicktime(new Date());
		nurseService.updateById(nurse);
        return R.ok().put("data", nurse);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NurseEntity nurse, HttpServletRequest request){
    	nurse.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nurse);
    	NurseEntity u = nurseService.selectOne(new EntityWrapper<NurseEntity>().eq("nurseaccountnumber", nurse.getNurseaccountnumber()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		nurse.setId(new Date().getTime());
        nurseService.insert(nurse);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NurseEntity nurse, HttpServletRequest request){
    	nurse.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nurse);
    	NurseEntity u = nurseService.selectOne(new EntityWrapper<NurseEntity>().eq("nurseaccountnumber", nurse.getNurseaccountnumber()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		nurse.setId(new Date().getTime());
        nurseService.insert(nurse);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody NurseEntity nurse, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nurse);
        nurseService.updateById(nurse);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nurseService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,NurseEntity nurse, HttpServletRequest request,String pre){
        EntityWrapper<NurseEntity> ew = new EntityWrapper<NurseEntity>();
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
		PageUtils page = nurseService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nurse), params), params));
        return R.ok().put("data", page);
    }









}
