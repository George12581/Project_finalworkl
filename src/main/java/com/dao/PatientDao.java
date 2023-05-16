package com.dao;

import com.entity.PatientEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PatientVO;
import com.entity.view.PatientView;


/**
 * patient
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface PatientDao extends BaseMapper<PatientEntity> {
	
	List<PatientVO> selectListVO(@Param("ew") Wrapper<PatientEntity> wrapper);
	
	PatientVO selectVO(@Param("ew") Wrapper<PatientEntity> wrapper);
	
	List<PatientView> selectListView(@Param("ew") Wrapper<PatientEntity> wrapper);

	List<PatientView> selectListView(Pagination page,@Param("ew") Wrapper<PatientEntity> wrapper);
	
	PatientView selectView(@Param("ew") Wrapper<PatientEntity> wrapper);
	

}
