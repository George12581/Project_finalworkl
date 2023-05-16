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
 * druginformation
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@TableName("druginformation")
public class DruginformationEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DruginformationEntity() {
		
	}
	
	public DruginformationEntity(T t) {
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
	 * drugname
	 */
					
	private String drugname;
	
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
