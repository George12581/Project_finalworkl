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
 * patient
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@TableName("patient")
public class PatientEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PatientEntity() {
		
	}
	
	public PatientEntity(T t) {
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
	 * patientname
	 */
					
	private String patientname;
	
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
	 * idnumber
	 */
					
	private String idnumber;
	
	/**
	 * patientaddress
	 */
					
	private String patientaddress;
	
	
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
	 * 设置：patientname
	 */
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	/**
	 * 获取：patientname
	 */
	public String getPatientname() {
		return patientname;
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
	 * 设置：idnumber
	 */
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	/**
	 * 获取：idnumber
	 */
	public String getIdnumber() {
		return idnumber;
	}
	/**
	 * 设置：patientaddress
	 */
	public void setPatientaddress(String patientaddress) {
		this.patientaddress = patientaddress;
	}
	/**
	 * 获取：patientaddress
	 */
	public String getPatientaddress() {
		return patientaddress;
	}

}
