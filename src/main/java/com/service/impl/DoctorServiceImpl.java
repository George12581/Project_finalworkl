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


import com.dao.DoctorDao;
import com.entity.DoctorEntity;
import com.service.DoctorService;
import com.entity.vo.DoctorVO;
import com.entity.view.DoctorView;

@Service("doctorService")
public class DoctorServiceImpl extends ServiceImpl<DoctorDao, DoctorEntity> implements DoctorService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DoctorEntity> page = this.selectPage(
                new Query<DoctorEntity>(params).getPage(),
                new EntityWrapper<DoctorEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DoctorEntity> wrapper) {
		  Page<DoctorView> page =new Query<DoctorView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DoctorVO> selectListVO(Wrapper<DoctorEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DoctorVO selectVO(Wrapper<DoctorEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DoctorView> selectListView(Wrapper<DoctorEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DoctorView selectView(Wrapper<DoctorEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
