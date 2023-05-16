package com.dao;

import com.entity.DruginformationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DruginformationVO;
import com.entity.view.DruginformationView;


/**
 * druginformation
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public interface DruginformationDao extends BaseMapper<DruginformationEntity> {
	
	List<DruginformationVO> selectListVO(@Param("ew") Wrapper<DruginformationEntity> wrapper);
	
	DruginformationVO selectVO(@Param("ew") Wrapper<DruginformationEntity> wrapper);
	
	List<DruginformationView> selectListView(@Param("ew") Wrapper<DruginformationEntity> wrapper);

	List<DruginformationView> selectListView(Pagination page,@Param("ew") Wrapper<DruginformationEntity> wrapper);
	
	DruginformationView selectView(@Param("ew") Wrapper<DruginformationEntity> wrapper);
	

}
