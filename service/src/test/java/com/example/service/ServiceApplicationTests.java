package com.example.service;

import com.example.mybatis.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {

	@Autowired
	IUserService userService;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setName("甘");
		user.setPassword("1234567");

		userService.saveUser(user);

	}

}
