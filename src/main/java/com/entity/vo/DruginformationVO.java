package com.entity.vo;

import com.entity.DruginformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * druginformation
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public class DruginformationVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * drugimage
	 */
	
	private String drugimage;
		
	/**
	 * warrantyperiod
	 */
	
	private String warrantyperiod;
		
	/**
	 * dosageform
	 */
	
	private String dosageform;
		
	/**
	 * drugdescription
	 */
	
	private String drugdescription;
		
	/**
	 * manufacturer
	 */
	
	private String manufacturer;
		
	/**
	 * specification
	 */
	
	private String specification;
		
	/**
	 * quantity
	 */
	
	private Integer quantity;
				
	
	/**
	 * 设置：drugimage
	 */
	 
	public void setDrugimage(String drugimage) {
		this.drugimage = drugimage;
	}
	
	/**
	 * 获取：drugimage
	 */
	public String getDrugimage() {
		return drugimage;
	}
				
	
	/**
	 * 设置：warrantyperiod
	 */
	 
	public void setWarrantyperiod(String warrantyperiod) {
		this.warrantyperiod = warrantyperiod;
	}
	
	/**
	 * 获取：warrantyperiod
	 */
	public String getWarrantyperiod() {
		return warrantyperiod;
	}
				
	
	/**
	 * 设置：dosageform
	 */
	 
	public void setDosageform(String dosageform) {
		this.dosageform = dosageform;
	}
	
	/**
	 * 获取：dosageform
	 */
	public String getDosageform() {
		return dosageform;
	}
				
	
	/**
	 * 设置：drugdescription
	 */
	 
	public void setDrugdescription(String drugdescription) {
		this.drugdescription = drugdescription;
	}
	
	/**
	 * 获取：drugdescription
	 */
	public String getDrugdescription() {
		return drugdescription;
	}
				
	
	/**
	 * 设置：manufacturer
	 */
	 
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	/**
	 * 获取：manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
				
	
	/**
	 * 设置：specification
	 */
	 
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	/**
	 * 获取：specification
	 */
	public String getSpecification() {
		return specification;
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
			
}
