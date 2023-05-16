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
 * inpatientregistration
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@TableName("inpatientregistration")
public class InpatientregistrationEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public InpatientregistrationEntity() {
		
	}
	
	public InpatientregistrationEntity(T t) {
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
	 * hospitalizationnumber
	 */
					
	private String hospitalizationnumber;
	
	/**
	 * patientname
	 */
					
	private String patientname;
	
	/**
	 * gender
	 */
					
	private String gender;
	
	/**
	 * age
	 */
					
	private String age;
	
	/**
	 * medicalrecorddescription
	 */
					
	private String medicalrecorddescription;
	
	/**
	 * hospitalizationdate
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date hospitalizationdate;
	
	/**
	 * hospitalizationnotes
	 */
					
	private String hospitalizationnotes;
	
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
	
	/**
	 * hospitalbednumber
	 */
					
	private String hospitalbednumber;
	
	/**
	 * nurseaccountnumber
	 */
					
	private String nurseaccountnumber;
	
	/**
	 * nursename
	 */
					
	private String nursename;
	
	
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
	 * 设置：hospitalizationnumber
	 */
	public void setHospitalizationnumber(String hospitalizationnumber) {
		this.hospitalizationnumber = hospitalizationnumber;
	}
	/**
	 * 获取：hospitalizationnumber
	 */
	public String getHospitalizationnumber() {
		return hospitalizationnumber;
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
	 * 设置：medicalrecorddescription
	 */
	public void setMedicalrecorddescription(String medicalrecorddescription) {
		this.medicalrecorddescription = medicalrecorddescription;
	}
	/**
	 * 获取：medicalrecorddescription
	 */
	public String getMedicalrecorddescription() {
		return medicalrecorddescription;
	}
	/**
	 * 设置：hospitalizationdate
	 */
	public void setHospitalizationdate(Date hospitalizationdate) {
		this.hospitalizationdate = hospitalizationdate;
	}
	/**
	 * 获取：hospitalizationdate
	 */
	public Date getHospitalizationdate() {
		return hospitalizationdate;
	}
	/**
	 * 设置：hospitalizationnotes
	 */
	public void setHospitalizationnotes(String hospitalizationnotes) {
		this.hospitalizationnotes = hospitalizationnotes;
	}
	/**
	 * 获取：hospitalizationnotes
	 */
	public String getHospitalizationnotes() {
		return hospitalizationnotes;
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
	/**
	 * 设置：hospitalbednumber
	 */
	public void setHospitalbednumber(String hospitalbednumber) {
		this.hospitalbednumber = hospitalbednumber;
	}
	/**
	 * 获取：hospitalbednumber
	 */
	public String getHospitalbednumber() {
		return hospitalbednumber;
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

}
