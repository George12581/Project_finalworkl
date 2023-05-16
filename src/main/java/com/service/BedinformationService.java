package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BedinformationEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BedinformationVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BedinformationView;


/**
 * bedinformation
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface BedinformationService extends IService<BedinformationEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BedinformationVO> selectListVO(Wrapper<BedinformationEntity> wrapper);
   	
   	BedinformationVO selectVO(@Param("ew") Wrapper<BedinformationEntity> wrapper);
   	
   	List<BedinformationView> selectListView(Wrapper<BedinformationEntity> wrapper);
   	
   	BedinformationView selectView(@Param("ew") Wrapper<BedinformationEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BedinformationEntity> wrapper);
   	

}

