package com.iyeedo.dao;

import java.util.List;

import com.iyeedo.model.User;

public interface UserDAO {
	public User getUserById(int id);
	public List<User> getUserByUserName(String userName);
	public List<User> getUserByLogin(String userName, String psw);
	public void deleteUserById(int id);
	public void SaveOrUpdateUser(User user);
}
