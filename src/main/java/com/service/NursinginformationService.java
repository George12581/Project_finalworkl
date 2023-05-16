package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NursinginformationEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NursinginformationVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NursinginformationView;


/**
 * nursinginformation
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface NursinginformationService extends IService<NursinginformationEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NursinginformationVO> selectListVO(Wrapper<NursinginformationEntity> wrapper);
   	
   	NursinginformationVO selectVO(@Param("ew") Wrapper<NursinginformationEntity> wrapper);
   	
   	List<NursinginformationView> selectListView(Wrapper<NursinginformationEntity> wrapper);
   	
   	NursinginformationView selectView(@Param("ew") Wrapper<NursinginformationEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NursinginformationEntity> wrapper);
   	

}

