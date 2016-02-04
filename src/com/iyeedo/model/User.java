package com.iyeedo.model;

import com.iyeedo.test.PrintClass;

public class User {
	public String birthday;

	public String city;

	public String country;

	public String createTime;

	public float gold;

	public int id;

	public String IDCard1;

	public String IDCard2;

	public String IDCard3;

	public String mobile;

	public String nickName;

	public String province;

	public String psw;

	public String region;

	public Byte sex;

	public String trueName;

	public Byte type;

	public String updateTime;

	public String userName;

	public Byte userStatus;

	public User() {
		PrintClass.Print("construct");
	}

	public String getBirthday() {
		return birthday;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getCreateTime() {
		return createTime;
	}

	public float getGold() {
		return gold;
	}

	public int getId() {
		return id;
	}

	public String getIDCard1() {
		return IDCard1;
	}

	public String getIDCard2() {
		return IDCard2;
	}

	public String getIDCard3() {
		return IDCard3;
	}

	public String getMobile() {
		return mobile;
	}

	public String getNickName() {
		return nickName;
	}

	public String getProvince() {
		return province;
	}

	public String getPsw() {
		return psw;
	}

	public String getRegion() {
		return region;
	}

	public Byte getSex() {
		return sex;
	}

	public String getTrueName() {
		return trueName;
	}

	public Byte getType() {
		return type;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String getUserName() {
		return userName;
	}

	public Byte getUserStatus() {
		return userStatus;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public void setGold(float gold) {
		this.gold = gold;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIDCard1(String iDCard1) {
		IDCard1 = iDCard1;
	}

	public void setIDCard2(String iDCard2) {
		IDCard2 = iDCard2;
	}

	public void setIDCard3(String iDCard3) {
		IDCard3 = iDCard3;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserStatus(byte userStatus) {
		this.userStatus = userStatus;
	}
}
