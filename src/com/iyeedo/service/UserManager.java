package com.iyeedo.service;

import com.iyeedo.model.User;

public interface UserManager {
	public void addUser(User user);
	public User getUserById(int id);
	public User getUserByLogin(String userName, String psw);
	public void deleteUserById(int id);
	public void SaveOrUpdateUser(User user);
}
