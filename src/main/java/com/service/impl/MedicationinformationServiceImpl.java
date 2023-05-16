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


import com.dao.MedicationinformationDao;
import com.entity.MedicationinformationEntity;
import com.service.MedicationinformationService;
import com.entity.vo.MedicationinformationVO;
import com.entity.view.MedicationinformationView;

@Service("medicationinformationService")
public class MedicationinformationServiceImpl extends ServiceImpl<MedicationinformationDao, MedicationinformationEntity> implements MedicationinformationService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MedicationinformationEntity> page = this.selectPage(
                new Query<MedicationinformationEntity>(params).getPage(),
                new EntityWrapper<MedicationinformationEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MedicationinformationEntity> wrapper) {
		  Page<MedicationinformationView> page =new Query<MedicationinformationView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MedicationinformationVO> selectListVO(Wrapper<MedicationinformationEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MedicationinformationVO selectVO(Wrapper<MedicationinformationEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MedicationinformationView> selectListView(Wrapper<MedicationinformationEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MedicationinformationView selectView(Wrapper<MedicationinformationEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
