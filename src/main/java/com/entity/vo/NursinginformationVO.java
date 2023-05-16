package com.entity.vo;

import com.entity.NursinginformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * nursinginformation
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public class NursinginformationVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * doctoraccountnumber
	 */
	
	private String doctoraccountnumber;
		
	/**
	 * doctorname
	 */
	
	private String doctorname;
		
	/**
	 * nursingcontent
	 */
	
	private String nursingcontent;
		
	/**
	 * nursingtime
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date nursingtime;
		
	/**
	 * nurseaccountnumber
	 */
	
	private String nurseaccountnumber;
		
	/**
	 * nursename
	 */
	
	private String nursename;
				
	
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
	 * 设置：nursingcontent
	 */
	 
	public void setNursingcontent(String nursingcontent) {
		this.nursingcontent = nursingcontent;
	}
	
	/**
	 * 获取：nursingcontent
	 */
	public String getNursingcontent() {
		return nursingcontent;
	}
				
	
	/**
	 * 设置：nursingtime
	 */
	 
	public void setNursingtime(Date nursingtime) {
		this.nursingtime = nursingtime;
	}
	
	/**
	 * 获取：nursingtime
	 */
	public Date getNursingtime() {
		return nursingtime;
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
