package com.cn.iceworld.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.iceworld.bean.UserInfo;
import com.cn.iceworld.dao.UserInfoDao;
import com.cn.iceworld.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserInfoDao userInfoDao;
	
	@Override
	public int insertUserInfo(UserInfo userInfo) {
		return userInfoDao.insert(userInfo);
	}

}
