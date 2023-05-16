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


import com.dao.BedinformationDao;
import com.entity.BedinformationEntity;
import com.service.BedinformationService;
import com.entity.vo.BedinformationVO;
import com.entity.view.BedinformationView;

@Service("bedinformationService")
public class BedinformationServiceImpl extends ServiceImpl<BedinformationDao, BedinformationEntity> implements BedinformationService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BedinformationEntity> page = this.selectPage(
                new Query<BedinformationEntity>(params).getPage(),
                new EntityWrapper<BedinformationEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BedinformationEntity> wrapper) {
		  Page<BedinformationView> page =new Query<BedinformationView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BedinformationVO> selectListVO(Wrapper<BedinformationEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BedinformationVO selectVO(Wrapper<BedinformationEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BedinformationView> selectListView(Wrapper<BedinformationEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BedinformationView selectView(Wrapper<BedinformationEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
