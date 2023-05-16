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


import com.dao.InpatientregistrationDao;
import com.entity.InpatientregistrationEntity;
import com.service.InpatientregistrationService;
import com.entity.vo.InpatientregistrationVO;
import com.entity.view.InpatientregistrationView;

@Service("inpatientregistrationService")
public class InpatientregistrationServiceImpl extends ServiceImpl<InpatientregistrationDao, InpatientregistrationEntity> implements InpatientregistrationService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<InpatientregistrationEntity> page = this.selectPage(
                new Query<InpatientregistrationEntity>(params).getPage(),
                new EntityWrapper<InpatientregistrationEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<InpatientregistrationEntity> wrapper) {
		  Page<InpatientregistrationView> page =new Query<InpatientregistrationView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<InpatientregistrationVO> selectListVO(Wrapper<InpatientregistrationEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public InpatientregistrationVO selectVO(Wrapper<InpatientregistrationEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<InpatientregistrationView> selectListView(Wrapper<InpatientregistrationEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public InpatientregistrationView selectView(Wrapper<InpatientregistrationEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
