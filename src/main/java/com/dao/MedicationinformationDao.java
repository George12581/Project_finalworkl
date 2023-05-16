package com.dao;

import com.entity.MedicationinformationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MedicationinformationVO;
import com.entity.view.MedicationinformationView;


/**
 * medicationinformation
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public interface MedicationinformationDao extends BaseMapper<MedicationinformationEntity> {
	
	List<MedicationinformationVO> selectListVO(@Param("ew") Wrapper<MedicationinformationEntity> wrapper);
	
	MedicationinformationVO selectVO(@Param("ew") Wrapper<MedicationinformationEntity> wrapper);
	
	List<MedicationinformationView> selectListView(@Param("ew") Wrapper<MedicationinformationEntity> wrapper);

	List<MedicationinformationView> selectListView(Pagination page,@Param("ew") Wrapper<MedicationinformationEntity> wrapper);
	
	MedicationinformationView selectView(@Param("ew") Wrapper<MedicationinformationEntity> wrapper);
	

}
