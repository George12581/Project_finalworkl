package com.entity.model;

import com.entity.PatientEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * patient
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public class PatientModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
