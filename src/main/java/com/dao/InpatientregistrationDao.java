package com.dao;

import com.entity.InpatientregistrationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.InpatientregistrationVO;
import com.entity.view.InpatientregistrationView;


/**
 * inpatientregistration
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface InpatientregistrationDao extends BaseMapper<InpatientregistrationEntity> {
	
	List<InpatientregistrationVO> selectListVO(@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);
	
	InpatientregistrationVO selectVO(@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);
	
	List<InpatientregistrationView> selectListView(@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);

	List<InpatientregistrationView> selectListView(Pagination page,@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);
	
	InpatientregistrationView selectView(@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);
	

}
