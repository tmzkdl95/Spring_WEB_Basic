package com.mycompany.service.memberService;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mycompany.dao.login_DAO.loginDAO;
import com.mycompany.vo.loginVO;


@Service
public class member_Service implements UserDetailsService {
		
	@Autowired
	private loginDAO logindao;
	//회원 가입 기능
	public void memberRegisterService(loginVO loginvo){
		System.out.println("memberRegisterService 실행");
		try {
			logindao.memberRegisterDAO(loginvo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername 실행 / username = " + username );
		loginVO user = new loginVO();
		
		try{
			user = logindao.memberConfirm(username);
			user.setUser_authority("ROLE_USER");
		}catch(SQLException e){
			e.printStackTrace();
		}
		/*
		if(user==null) {
            throw new UsernameNotFoundException(username);
        }*/
		System.out.println("[head] user setting info >>>>>>>>>>>>>>>>>"+user);
	
		return user;
	}
}
