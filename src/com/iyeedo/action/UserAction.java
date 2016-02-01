package com.iyeedo.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.iyeedo.model.User;
import com.iyeedo.service.UserManager;
import com.iyeedo.test.PrintClass;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private int id;
	private User user;
	private UserManager userManager;
	private String userName;
	private String psw;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public int getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public UserManager getUserManager() {
		return userManager;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public String addUser(){
		this.userManager.addUser(this.user);
		return SUCCESS;
	}
	
	public String deleteUser(){
		this.userManager.deleteUserById(id);
		return SUCCESS;
	}
	
	public String saveOrUpdate(){
		this.userManager.SaveOrUpdateUser(user);
		return SUCCESS;
	}
	
	public String login(){
		User loginUser = this.userManager.getUserByLogin(userName.trim(), psw);
		if(loginUser != null){
			PrintClass.Print("用户:" + userName + "登录成功！");
			ActionContext actionContext = ActionContext.getContext();
			HttpServletRequest httpServletRequest = (HttpServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);
			httpServletRequest.getSession().setAttribute("user", loginUser);
			return SUCCESS;
		}
		else{
			PrintClass.Print("登录失败！");
			return ERROR;
		}
	}
	
}
