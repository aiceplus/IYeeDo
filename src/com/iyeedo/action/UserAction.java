package com.iyeedo.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.iyeedo.enums.SaveOrUpdate;
import com.iyeedo.model.User;
import com.iyeedo.service.UserManager;
import com.iyeedo.test.PrintClass;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private int id;
	public User user;
	private UserManager userManager;
	private String userName;
	private String psw;
	ActionContext actionContext;
	HttpServletRequest httpServletRequest;

	private void initContext() {
		actionContext = ActionContext.getContext();
		
		httpServletRequest = (HttpServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);
		try {
			httpServletRequest.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("httpServletRequest.setCharacterEncoding�쳣��");
			e.printStackTrace();
		}
	}

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

	public String deleteUser() {
		this.userManager.deleteUserById(id);
		return SUCCESS;
	}

	public String regist() {
		if (this.userManager.getUserByUserName(user.getUserName()) > 0) {
			/** �û����Ѵ��� */
			PrintClass.Print("�û����Ѵ���");
			return ERROR;
		} else {
			this.userManager.SaveOrUpdateUser(user, SaveOrUpdate.SAVE);
			return SUCCESS;
		}
	}

	public String update() {
		initContext();
		this.userManager.SaveOrUpdateUser(user, SaveOrUpdate.UPDATE);
		return SUCCESS;
	}

	public String login() {
		initContext();
		User loginUser = this.userManager.getUserByLogin(userName.trim(), psw);
		if (loginUser != null) {
			PrintClass.Print("�û�:" + userName + "��¼�ɹ���");
			if (httpServletRequest != null)
				httpServletRequest.getSession().setAttribute("user", loginUser);
			return SUCCESS;
		} else {
			PrintClass.Print("��¼ʧ�ܣ�");
			return ERROR;
		}
	}

	public String logout() {
		initContext();
		if (httpServletRequest != null) {
			httpServletRequest.getSession().removeAttribute("user");
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
