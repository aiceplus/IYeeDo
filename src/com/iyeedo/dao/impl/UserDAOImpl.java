package com.iyeedo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.iyeedo.dao.UserDAO;
import com.iyeedo.model.User;

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
		
		Transaction transaction = this.getCurrentSession().getTransaction();
		transaction.begin();
		this.getCurrentSession().saveOrUpdate(user);
		transaction.commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserByLogin(String userName, String psw) {
		
		// TODO Auto-generated method stub
		Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
		String sql = "SELECT * FROM USER_TB WHERE USERNAME= '" + userName + "' AND PSW='" + psw + "'";
		List<User> resultList = this.getCurrentSession().createSQLQuery(sql).addEntity(User.class).list();
		
		transaction.commit();
		
		return resultList;
	}

	@Override
	public List<User> getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		Transaction transaction = this.getCurrentSession().beginTransaction();
		String sql = "SELECT * FROM USER_TB WHERE USERNAME='" + userName + "'";
		List<User> resultList = this.getCurrentSession().createSQLQuery(sql).addEntity(User.class).list();
		
		transaction.commit();
//		if(size > 0){
//			/**×¢²áÃûÒÑ´æÔÚ*/
//		}else{
//			
//		}
		return resultList;
	}
	
}
