package com.entity.model;

import com.entity.MedicationinformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * medicationinformation
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public class MedicationinformationModel  implements Serializable {
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
