package com.entity.view;

import com.entity.PatientEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * patient
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
@TableName("patient")
public class PatientView  extends PatientEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PatientView(){
	}
 
 	public PatientView(PatientEntity patientEntity){
 	try {
			BeanUtils.copyProperties(this, patientEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
