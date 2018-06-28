package com.dms.myssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.myssm.dao.UserInfoMapper;
import com.dms.myssm.entity.UserInfo;
import com.dms.myssm.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoMapper mapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(UserInfo record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(UserInfo record) {
		return mapper.insertSelective(record);
	}

	@Override
	public UserInfo selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		return mapper.updateByPrimaryKey(record);
	}

}
