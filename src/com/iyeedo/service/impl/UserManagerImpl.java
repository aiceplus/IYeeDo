package com.iyeedo.service.impl;

import com.iyeedo.dao.UserDAO;
import com.iyeedo.model.User;
import com.iyeedo.service.UserManager;
import com.iyeedo.test.PrintClass;

public class UserManagerImpl implements UserManager{
	private UserDAO userDao;
	public UserDAO getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.addUser(user);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDao.getUserById(id);
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		this.userDao.deleteUserById(id);
	}

	@Override
	public void SaveOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.SaveOrUpdateUser(user);
	}

	@Override
	public User getUserByLogin(String userName, String psw) {
		// TODO Auto-generated method stub
		
		PrintClass.PrintAll(userName, psw);
		return userDao.getUserByLogin(userName, psw);
	}

	
}
