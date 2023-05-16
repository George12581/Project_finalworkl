package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NurseEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NurseVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NurseView;


/**
 * nurse
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface NurseService extends IService<NurseEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NurseVO> selectListVO(Wrapper<NurseEntity> wrapper);
   	
   	NurseVO selectVO(@Param("ew") Wrapper<NurseEntity> wrapper);
   	
   	List<NurseView> selectListView(Wrapper<NurseEntity> wrapper);
   	
   	NurseView selectView(@Param("ew") Wrapper<NurseEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NurseEntity> wrapper);
   	

}

