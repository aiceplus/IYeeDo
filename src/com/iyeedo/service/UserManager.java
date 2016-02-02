package com.iyeedo.service;


import com.iyeedo.enums.SaveOrUpdate;
import com.iyeedo.model.User;

public interface UserManager {
	public User getUserById(int id);
	public User getUserByLogin(String userName, String psw);
	public int getUserByUserName(String userName);
	public void deleteUserById(int id);
	public void SaveOrUpdateUser(User user, SaveOrUpdate type);
}
