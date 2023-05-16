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
 * nurse
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@TableName("nurse")
public class NurseEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NurseEntity() {
		
	}
	
	public NurseEntity(T t) {
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
	 * nurseaccountnumber
	 */
					
	private String nurseaccountnumber;
	
	/**
	 * password
	 */
					
	private String password;
	
	/**
	 * nursename
	 */
					
	private String nursename;
	
	/**
	 * avatar
	 */
					
	private String avatar;
	
	/**
	 * gender
	 */
					
	private String gender;
	
	/**
	 * age
	 */
					
	private String age;
	
	/**
	 * mobilenumber
	 */
					
	private String mobilenumber;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：nurseaccountnumber
	 */
	public void setNurseaccountnumber(String nurseaccountnumber) {
		this.nurseaccountnumber = nurseaccountnumber;
	}
	/**
	 * 获取：nurseaccountnumber
	 */
	public String getNurseaccountnumber() {
		return nurseaccountnumber;
	}
	/**
	 * 设置：password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：nursename
	 */
	public void setNursename(String nursename) {
		this.nursename = nursename;
	}
	/**
	 * 获取：nursename
	 */
	public String getNursename() {
		return nursename;
	}
	/**
	 * 设置：avatar
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * 获取：avatar
	 */
	public String getAvatar() {
		return avatar;
	}
	/**
	 * 设置：gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 获取：gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置：age
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 获取：age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 设置：mobilenumber
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	/**
	 * 获取：mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
