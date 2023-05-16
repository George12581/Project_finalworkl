package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DischargeinformationEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DischargeinformationVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DischargeinformationView;


/**
 * dischargeinformation
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public interface DischargeinformationService extends IService<DischargeinformationEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DischargeinformationVO> selectListVO(Wrapper<DischargeinformationEntity> wrapper);
   	
   	DischargeinformationVO selectVO(@Param("ew") Wrapper<DischargeinformationEntity> wrapper);
   	
   	List<DischargeinformationView> selectListView(Wrapper<DischargeinformationEntity> wrapper);
   	
   	DischargeinformationView selectView(@Param("ew") Wrapper<DischargeinformationEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DischargeinformationEntity> wrapper);
   	

}

