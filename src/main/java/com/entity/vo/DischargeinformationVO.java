package com.entity.vo;

import com.entity.DischargeinformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * dischargeinformation
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public class DischargeinformationVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * gender
	 */
	
	private String gender;
		
	/**
	 * patientname
	 */
	
	private String patientname;
		
	/**
	 * age
	 */
	
	private String age;
		
	/**
	 * hospitalizationdate
	 */
	
	private String hospitalizationdate;
		
	/**
	 * dischargerecord
	 */
	
	private String dischargerecord;
		
	/**
	 * dischargetime
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dischargetime;
		
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
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：hospitalizationdate
	 */
	 
	public void setHospitalizationdate(String hospitalizationdate) {
		this.hospitalizationdate = hospitalizationdate;
	}
	
	/**
	 * 获取：hospitalizationdate
	 */
	public String getHospitalizationdate() {
		return hospitalizationdate;
	}
				
	
	/**
	 * 设置：dischargerecord
	 */
	 
	public void setDischargerecord(String dischargerecord) {
		this.dischargerecord = dischargerecord;
	}
	
	/**
	 * 获取：dischargerecord
	 */
	public String getDischargerecord() {
		return dischargerecord;
	}
				
	
	/**
	 * 设置：dischargetime
	 */
	 
	public void setDischargetime(Date dischargetime) {
		this.dischargetime = dischargetime;
	}
	
	/**
	 * 获取：dischargetime
	 */
	public Date getDischargetime() {
		return dischargetime;
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
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
