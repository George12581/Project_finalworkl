package com.dao;

import com.entity.NursinginformationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NursinginformationVO;
import com.entity.view.NursinginformationView;


/**
 * nursinginformation
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface NursinginformationDao extends BaseMapper<NursinginformationEntity> {
	
	List<NursinginformationVO> selectListVO(@Param("ew") Wrapper<NursinginformationEntity> wrapper);
	
	NursinginformationVO selectVO(@Param("ew") Wrapper<NursinginformationEntity> wrapper);
	
	List<NursinginformationView> selectListView(@Param("ew") Wrapper<NursinginformationEntity> wrapper);

	List<NursinginformationView> selectListView(Pagination page,@Param("ew") Wrapper<NursinginformationEntity> wrapper);
	
	NursinginformationView selectView(@Param("ew") Wrapper<NursinginformationEntity> wrapper);
	

}
