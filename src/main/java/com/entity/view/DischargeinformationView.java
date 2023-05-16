package com.entity.view;

import com.entity.DischargeinformationEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * dischargeinformation
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
@TableName("dischargeinformation")
public class DischargeinformationView  extends DischargeinformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DischargeinformationView(){
	}
 
 	public DischargeinformationView(DischargeinformationEntity dischargeinformationEntity){
 	try {
			BeanUtils.copyProperties(this, dischargeinformationEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
