package com.mycompany.vo;

public class loginVO {
	String user_id;
	String user_pw;
	String user_mail;
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	
	
	@Override
	public String toString() {
		return "loginVO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_mail=" + user_mail + "]";
	}
	
}
