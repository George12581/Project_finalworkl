package com.entity.view;

import com.entity.MedicationinformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * medicationinformation
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@TableName("medicationinformation")
public class MedicationinformationView  extends MedicationinformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MedicationinformationView(){
	}
 
 	public MedicationinformationView(MedicationinformationEntity medicationinformationEntity){
 	try {
			BeanUtils.copyProperties(this, medicationinformationEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
