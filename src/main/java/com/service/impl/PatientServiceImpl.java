package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PatientDao;
import com.entity.PatientEntity;
import com.service.PatientService;
import com.entity.vo.PatientVO;
import com.entity.view.PatientView;

@Service("patientService")
public class PatientServiceImpl extends ServiceImpl<PatientDao, PatientEntity> implements PatientService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PatientEntity> page = this.selectPage(
                new Query<PatientEntity>(params).getPage(),
                new EntityWrapper<PatientEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PatientEntity> wrapper) {
		  Page<PatientView> page =new Query<PatientView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PatientVO> selectListVO(Wrapper<PatientEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PatientVO selectVO(Wrapper<PatientEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PatientView> selectListView(Wrapper<PatientEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PatientView selectView(Wrapper<PatientEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
