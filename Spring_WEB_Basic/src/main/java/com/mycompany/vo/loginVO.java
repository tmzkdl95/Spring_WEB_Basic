package com.mycompany.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class loginVO implements UserDetails{

	String user_id;
	String user_pw;
	String user_mail;
	String user_authority;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 	ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		 	authorities.add(new SimpleGrantedAuthority(user_authority));
	        return authorities;
	}

	@Override
	public String getPassword() {
		
		return user_pw;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user_id;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	//계정 잠금
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	//
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	//계정 활성 / 비활성 여부
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
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
