package com.dao;

import com.entity.BedinformationEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BedinformationVO;
import com.entity.view.BedinformationView;


/**
 * bedinformation
 * 
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface BedinformationDao extends BaseMapper<BedinformationEntity> {
	
	List<BedinformationVO> selectListVO(@Param("ew") Wrapper<BedinformationEntity> wrapper);
	
	BedinformationVO selectVO(@Param("ew") Wrapper<BedinformationEntity> wrapper);
	
	List<BedinformationView> selectListView(@Param("ew") Wrapper<BedinformationEntity> wrapper);

	List<BedinformationView> selectListView(Pagination page,@Param("ew") Wrapper<BedinformationEntity> wrapper);
	
	BedinformationView selectView(@Param("ew") Wrapper<BedinformationEntity> wrapper);
	

}
