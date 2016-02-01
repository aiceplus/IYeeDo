package com.iyeedo.dao.impl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.iyeedo.dao.UserDAO;
import com.iyeedo.model.User;
import com.iyeedo.test.PrintClass;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		org.hibernate.Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
		Serializable s = getCurrentSession().save(user);
		System.out.println("s=" + s.toString() + "user=" + user.getUserName());
		transaction.commit();
		System.out.println("commit ok");
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return (User) this.getCurrentSession().get(User.class, id);
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		this.getCurrentSession().delete(this.getUserById(id));
	}

	@Override
	public void SaveOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		this.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserByLogin(String userName, String psw) {
		
		// TODO Auto-generated method stub
		org.hibernate.Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
		String sql = "SELECT * FROM USER_TB WHERE USERNAME= '" + userName + "' AND PSW='" + psw + "'";
		List<User> resultList = this.getCurrentSession().createSQLQuery(sql).addEntity(User.class).list();
		int size = resultList.size();
		transaction.commit();
		if (size > 0) {
			if(size > 1) {
				/**查询出多个用户  抛出异常*/
				PrintClass.Print("查出多个用户");
				return null;
			}
			PrintClass.Print("查询用户成功");
			Iterator<User> iterator = resultList.iterator();
			User loginUser = null;
			while(iterator.hasNext()){
				loginUser = iterator.next();
				return loginUser;
			}
		} else {
			return null;
		}
		return null;
	}

}
