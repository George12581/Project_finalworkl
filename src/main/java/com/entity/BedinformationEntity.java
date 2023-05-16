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
 * bedinformation
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@TableName("bedinformation")
public class BedinformationEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BedinformationEntity() {
		
	}
	
	public BedinformationEntity(T t) {
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
	 * hospitalbednumber
	 */
					
	private String hospitalbednumber;
	
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
