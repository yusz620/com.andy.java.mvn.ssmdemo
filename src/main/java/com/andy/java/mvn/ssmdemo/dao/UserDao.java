package com.andy.java.mvn.ssmdemo.dao;

import com.andy.java.mvn.ssmdemo.entity.User;

public interface UserDao {
	public User selectUserById(Integer id);
	
}
