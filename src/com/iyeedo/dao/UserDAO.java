package com.iyeedo.dao;

import com.iyeedo.model.User;

public interface UserDAO {
	public void addUser(User user);
	public User getUserById(int id);
	public User getUserByLogin(String userName, String psw);
	public void deleteUserById(int id);
	public void SaveOrUpdateUser(User user);
}
