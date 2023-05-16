package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PatientEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PatientVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PatientView;


/**
 * patient
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface PatientService extends IService<PatientEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PatientVO> selectListVO(Wrapper<PatientEntity> wrapper);
   	
   	PatientVO selectVO(@Param("ew") Wrapper<PatientEntity> wrapper);
   	
   	List<PatientView> selectListView(Wrapper<PatientEntity> wrapper);
   	
   	PatientView selectView(@Param("ew") Wrapper<PatientEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PatientEntity> wrapper);
   	

}

