package com.dao;

import com.entity.NurseEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NurseVO;
import com.entity.view.NurseView;


/**
 * nurse
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface NurseDao extends BaseMapper<NurseEntity> {
	
	List<NurseVO> selectListVO(@Param("ew") Wrapper<NurseEntity> wrapper);
	
	NurseVO selectVO(@Param("ew") Wrapper<NurseEntity> wrapper);
	
	List<NurseView> selectListView(@Param("ew") Wrapper<NurseEntity> wrapper);

	List<NurseView> selectListView(Pagination page,@Param("ew") Wrapper<NurseEntity> wrapper);
	
	NurseView selectView(@Param("ew") Wrapper<NurseEntity> wrapper);
	

}
