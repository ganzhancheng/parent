package com.example.service.impl;

import com.example.mybatis.IDao.UserMapper;
import com.example.mybatis.domain.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User getByName(String name) {
		return null;
	}

	@Override
	public void saveUser(User user) {
		userMapper.insertSelective(user);
	}
}
