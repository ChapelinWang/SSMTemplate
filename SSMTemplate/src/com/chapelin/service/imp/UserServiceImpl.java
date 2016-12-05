package com.chapelin.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapelin.inter.UserMapper;
import com.chapelin.model.User;
import com.chapelin.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean checkLogin(String username, String password) {
		User user=userMapper.selectUserByName(username);
		if(user==null){
			return false;
		}else if(user.getPassword().equals(password)){
			return true;
		}else{
			return false;
		}
	}
	
}
