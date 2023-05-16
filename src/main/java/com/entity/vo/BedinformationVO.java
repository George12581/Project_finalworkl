package com.entity.vo;

import com.entity.BedinformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * bedinformation
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public class BedinformationVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * usestatus
	 */
	
	private String usestatus;
		
	/**
	 * nurseaccountnumber
	 */
	
	private String nurseaccountnumber;
		
	/**
	 * nursename
	 */
	
	private String nursename;
		
	/**
	 * remarks
	 */
	
	private String remarks;
				
	
	/**
	 * 设置：usestatus
	 */
	 
	public void setUsestatus(String usestatus) {
		this.usestatus = usestatus;
	}
	
	/**
	 * 获取：usestatus
	 */
	public String getUsestatus() {
		return usestatus;
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
	 * 设置：remarks
	 */
	 
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	/**
	 * 获取：remarks
	 */
	public String getRemarks() {
		return remarks;
	}
			
}
