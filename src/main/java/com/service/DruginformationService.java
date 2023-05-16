package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DruginformationEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DruginformationVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DruginformationView;


/**
 * druginformation
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:09
 */
public interface DruginformationService extends IService<DruginformationEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DruginformationVO> selectListVO(Wrapper<DruginformationEntity> wrapper);
   	
   	DruginformationVO selectVO(@Param("ew") Wrapper<DruginformationEntity> wrapper);
   	
   	List<DruginformationView> selectListView(Wrapper<DruginformationEntity> wrapper);
   	
   	DruginformationView selectView(@Param("ew") Wrapper<DruginformationEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DruginformationEntity> wrapper);
   	

}

