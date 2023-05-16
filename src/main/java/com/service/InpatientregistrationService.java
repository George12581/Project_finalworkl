package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.InpatientregistrationEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.InpatientregistrationVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.InpatientregistrationView;


/**
 * inpatientregistration
 *
 * @author 
 * @email 
 * @date 2023-05-06 15:48:08
 */
public interface InpatientregistrationService extends IService<InpatientregistrationEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<InpatientregistrationVO> selectListVO(Wrapper<InpatientregistrationEntity> wrapper);
   	
   	InpatientregistrationVO selectVO(@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);
   	
   	List<InpatientregistrationView> selectListView(Wrapper<InpatientregistrationEntity> wrapper);
   	
   	InpatientregistrationView selectView(@Param("ew") Wrapper<InpatientregistrationEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<InpatientregistrationEntity> wrapper);
   	

}

