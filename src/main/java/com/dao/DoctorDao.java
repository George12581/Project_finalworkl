package com.dao;

import com.entity.DoctorEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DoctorVO;
import com.entity.view.DoctorView;


/**
 * doctor
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface DoctorDao extends BaseMapper<DoctorEntity> {
	
	List<DoctorVO> selectListVO(@Param("ew") Wrapper<DoctorEntity> wrapper);
	
	DoctorVO selectVO(@Param("ew") Wrapper<DoctorEntity> wrapper);
	
	List<DoctorView> selectListView(@Param("ew") Wrapper<DoctorEntity> wrapper);

	List<DoctorView> selectListView(Pagination page,@Param("ew") Wrapper<DoctorEntity> wrapper);
	
	DoctorView selectView(@Param("ew") Wrapper<DoctorEntity> wrapper);
	

}
