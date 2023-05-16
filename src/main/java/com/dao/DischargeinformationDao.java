package com.dao;

import com.entity.DischargeinformationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DischargeinformationVO;
import com.entity.view.DischargeinformationView;


/**
 * dischargeinformation
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public interface DischargeinformationDao extends BaseMapper<DischargeinformationEntity> {
	
	List<DischargeinformationVO> selectListVO(@Param("ew") Wrapper<DischargeinformationEntity> wrapper);
	
	DischargeinformationVO selectVO(@Param("ew") Wrapper<DischargeinformationEntity> wrapper);
	
	List<DischargeinformationView> selectListView(@Param("ew") Wrapper<DischargeinformationEntity> wrapper);

	List<DischargeinformationView> selectListView(Pagination page,@Param("ew") Wrapper<DischargeinformationEntity> wrapper);
	
	DischargeinformationView selectView(@Param("ew") Wrapper<DischargeinformationEntity> wrapper);
	

}
