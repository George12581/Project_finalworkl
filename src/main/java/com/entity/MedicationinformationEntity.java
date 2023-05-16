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
 * medicationinformation
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@TableName("medicationinformation")
public class MedicationinformationEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MedicationinformationEntity() {
		
	}
	
	public MedicationinformationEntity(T t) {
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
	 * medicationnumber
	 */
					
	private String medicationnumber;
	
	/**
	 * patientname
	 */
					
	private String patientname;
	
	/**
	 * gender
	 */
					
	private String gender;
	
	/**
	 * drugname
	 */
					
	private String drugname;
	
	/**
	 * quantity
	 */
					
	private Integer quantity;
	
	/**
	 * medicationdetails
	 */
					
	private String medicationdetails;
	
	/**
	 * issuingtime
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date issuingtime;
	
	/**
	 * doctoraccountnumber
	 */
					
	private String doctoraccountnumber;
	
	/**
	 * doctorname
	 */
					
	private String doctorname;
	
	/**
	 * medicalhealthfield
	 */
					
	private String medicalhealthfield;
	
	
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
	 * 设置：medicationnumber
	 */
	public void setMedicationnumber(String medicationnumber) {
		this.medicationnumber = medicationnumber;
	}
	/**
	 * 获取：medicationnumber
	 */
	public String getMedicationnumber() {
		return medicationnumber;
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
	 * 设置：drugname
	 */
	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}
	/**
	 * 获取：drugname
	 */
	public String getDrugname() {
		return drugname;
	}
	/**
	 * 设置：quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 获取：quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 设置：medicationdetails
	 */
	public void setMedicationdetails(String medicationdetails) {
		this.medicationdetails = medicationdetails;
	}
	/**
	 * 获取：medicationdetails
	 */
	public String getMedicationdetails() {
		return medicationdetails;
	}
	/**
	 * 设置：issuingtime
	 */
	public void setIssuingtime(Date issuingtime) {
		this.issuingtime = issuingtime;
	}
	/**
	 * 获取：issuingtime
	 */
	public Date getIssuingtime() {
		return issuingtime;
	}
	/**
	 * 设置：doctoraccountnumber
	 */
	public void setDoctoraccountnumber(String doctoraccountnumber) {
		this.doctoraccountnumber = doctoraccountnumber;
	}
	/**
	 * 获取：doctoraccountnumber
	 */
	public String getDoctoraccountnumber() {
		return doctoraccountnumber;
	}
	/**
	 * 设置：doctorname
	 */
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	/**
	 * 获取：doctorname
	 */
	public String getDoctorname() {
		return doctorname;
	}
	/**
	 * 设置：medicalhealthfield
	 */
	public void setMedicalhealthfield(String medicalhealthfield) {
		this.medicalhealthfield = medicalhealthfield;
	}
	/**
	 * 获取：medicalhealthfield
	 */
	public String getMedicalhealthfield() {
		return medicalhealthfield;
	}

}
