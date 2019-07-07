package com.coming.look.dao;

import com.coming.look.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCityDao {
	
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testInsert(){
		User user = new User();
		user.setAge(11);
		user.setBirthDay("2019-12-12");
		user.setUserName("tom");
		user.setCreateTime(new Date());
		userMapper.insert(user);
	}
}
