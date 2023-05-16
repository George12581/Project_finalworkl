package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DoctorEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DoctorVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DoctorView;


/**
 * doctor
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface DoctorService extends IService<DoctorEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DoctorVO> selectListVO(Wrapper<DoctorEntity> wrapper);
   	
   	DoctorVO selectVO(@Param("ew") Wrapper<DoctorEntity> wrapper);
   	
   	List<DoctorView> selectListView(Wrapper<DoctorEntity> wrapper);
   	
   	DoctorView selectView(@Param("ew") Wrapper<DoctorEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DoctorEntity> wrapper);
   	

}

