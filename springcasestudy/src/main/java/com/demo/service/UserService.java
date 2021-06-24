package com.demo.service;

import com.demo.model.User;

public interface UserService {
	
	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
