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


import com.dao.DruginformationDao;
import com.entity.DruginformationEntity;
import com.service.DruginformationService;
import com.entity.vo.DruginformationVO;
import com.entity.view.DruginformationView;

@Service("druginformationService")
public class DruginformationServiceImpl extends ServiceImpl<DruginformationDao, DruginformationEntity> implements DruginformationService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DruginformationEntity> page = this.selectPage(
                new Query<DruginformationEntity>(params).getPage(),
                new EntityWrapper<DruginformationEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DruginformationEntity> wrapper) {
		  Page<DruginformationView> page =new Query<DruginformationView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DruginformationVO> selectListVO(Wrapper<DruginformationEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DruginformationVO selectVO(Wrapper<DruginformationEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DruginformationView> selectListView(Wrapper<DruginformationEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DruginformationView selectView(Wrapper<DruginformationEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
