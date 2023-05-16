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


import com.dao.DischargeinformationDao;
import com.entity.DischargeinformationEntity;
import com.service.DischargeinformationService;
import com.entity.vo.DischargeinformationVO;
import com.entity.view.DischargeinformationView;

@Service("dischargeinformationService")
public class DischargeinformationServiceImpl extends ServiceImpl<DischargeinformationDao, DischargeinformationEntity> implements DischargeinformationService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DischargeinformationEntity> page = this.selectPage(
                new Query<DischargeinformationEntity>(params).getPage(),
                new EntityWrapper<DischargeinformationEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DischargeinformationEntity> wrapper) {
		  Page<DischargeinformationView> page =new Query<DischargeinformationView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DischargeinformationVO> selectListVO(Wrapper<DischargeinformationEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DischargeinformationVO selectVO(Wrapper<DischargeinformationEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DischargeinformationView> selectListView(Wrapper<DischargeinformationEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DischargeinformationView selectView(Wrapper<DischargeinformationEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
