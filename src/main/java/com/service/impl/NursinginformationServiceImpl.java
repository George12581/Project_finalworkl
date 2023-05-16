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


import com.dao.NursinginformationDao;
import com.entity.NursinginformationEntity;
import com.service.NursinginformationService;
import com.entity.vo.NursinginformationVO;
import com.entity.view.NursinginformationView;

@Service("nursinginformationService")
public class NursinginformationServiceImpl extends ServiceImpl<NursinginformationDao, NursinginformationEntity> implements NursinginformationService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NursinginformationEntity> page = this.selectPage(
                new Query<NursinginformationEntity>(params).getPage(),
                new EntityWrapper<NursinginformationEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NursinginformationEntity> wrapper) {
		  Page<NursinginformationView> page =new Query<NursinginformationView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NursinginformationVO> selectListVO(Wrapper<NursinginformationEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NursinginformationVO selectVO(Wrapper<NursinginformationEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NursinginformationView> selectListView(Wrapper<NursinginformationEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NursinginformationView selectView(Wrapper<NursinginformationEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
