package com.example.service;

import com.example.mybatis.domain.User;

public interface IUserService {
	User getByName(String name);

	void saveUser(User user);
}
