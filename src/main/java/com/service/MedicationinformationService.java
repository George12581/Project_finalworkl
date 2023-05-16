package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MedicationinformationEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MedicationinformationVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MedicationinformationView;


/**
 * medicationinformation
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public interface MedicationinformationService extends IService<MedicationinformationEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MedicationinformationVO> selectListVO(Wrapper<MedicationinformationEntity> wrapper);
   	
   	MedicationinformationVO selectVO(@Param("ew") Wrapper<MedicationinformationEntity> wrapper);
   	
   	List<MedicationinformationView> selectListView(Wrapper<MedicationinformationEntity> wrapper);
   	
   	MedicationinformationView selectView(@Param("ew") Wrapper<MedicationinformationEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MedicationinformationEntity> wrapper);
   	

}

