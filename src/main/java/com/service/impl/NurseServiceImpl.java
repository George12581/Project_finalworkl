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


import com.dao.NurseDao;
import com.entity.NurseEntity;
import com.service.NurseService;
import com.entity.vo.NurseVO;
import com.entity.view.NurseView;

@Service("nurseService")
public class NurseServiceImpl extends ServiceImpl<NurseDao, NurseEntity> implements NurseService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NurseEntity> page = this.selectPage(
                new Query<NurseEntity>(params).getPage(),
                new EntityWrapper<NurseEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NurseEntity> wrapper) {
		  Page<NurseView> page =new Query<NurseView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NurseVO> selectListVO(Wrapper<NurseEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NurseVO selectVO(Wrapper<NurseEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NurseView> selectListView(Wrapper<NurseEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NurseView selectView(Wrapper<NurseEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
