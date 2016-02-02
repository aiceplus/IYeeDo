package com.iyeedo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.iyeedo.dao.UserDAO;
import com.iyeedo.enums.SaveOrUpdate;
import com.iyeedo.model.User;
import com.iyeedo.service.UserManager;
import com.iyeedo.test.PrintClass;

public class UserManagerImpl implements UserManager {
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
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
	public void SaveOrUpdateUser(User user, SaveOrUpdate type) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		String operateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
		PrintClass.Print(operateTime);
		switch (type) {
		case SAVE:
			/** 新用户注册 */
			user.setGold(0);
			user.setSex((byte) 0);
			user.setUserStatus((byte) 0);
			user.setType((byte) 0);
			user.setCreateTime(operateTime);
			break;
		case UPDATE:
			/** 用户更新资料 */
			user.setUpdateTime(operateTime);
			break;
		default:
			/** 抛出异常 */
			break;
		}
		this.userDao.SaveOrUpdateUser(user);
	}

	@Override
	public User getUserByLogin(String userName, String psw) {
		// TODO Auto-generated method stub

		PrintClass.PrintAll(userName, psw);
		List<User> resultList = userDao.getUserByLogin(userName, psw);
		int size = resultList.size();
		if (size > 0) {
			if (size > 1) {
				/** 查询出多个用户 抛出异常 */
				PrintClass.Print("查出多个用户");
				return null;
			}
			PrintClass.Print("查询用户成功");
			Iterator<User> iterator = resultList.iterator();
			User loginUser = null;
			while (iterator.hasNext()) {
				loginUser = iterator.next();
				return loginUser;
			}
		} else {
			return null;
		}
		return null;
	}

	@Override
	public int getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		List<User> resultList = userDao.getUserByUserName(userName);
		int size = resultList.size();
		return size;
	}

}
