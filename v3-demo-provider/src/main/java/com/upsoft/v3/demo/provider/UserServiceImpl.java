package com.upsoft.v3.demo.provider;
import com.upsoft.v3.demo.api.User;
import com.upsoft.v3.demo.api.UserService;

public class UserServiceImpl implements UserService{

	public User getUser(long id) {
		// TODO Auto-generated method stub
		return new User(id, "username" + id);
	}

}
