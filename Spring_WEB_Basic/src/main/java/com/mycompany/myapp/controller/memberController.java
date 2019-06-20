package com.mycompany.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.security.web.authentication.*;

import com.mycompany.service.memberService.member_Service;
import com.mycompany.vo.loginVO;
import com.mycompany.vo.testPage;


//회원 관리 컨트롤러 로그아웃 / 회원가입
@Controller
public class memberController {
	
	//서비스 객체 생성
	@Autowired
	private member_Service ms;
	//Bcrypt 암호화 객체 생성
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	
	//로그인 페이지 입장 defualt = get 방식
	@RequestMapping(value = "/login")
	public String loginpage(){
		return "logInfo/login";
	}
	
	//로그인 동작
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String member_login(@ModelAttribute loginVO loginvo){
		System.out.println("member_login 동작 시작");
		ms.loadUserByUsername(loginvo.getUser_id());
		
		return "/";
	}
	
	//회원가입 페이지 입장
	@RequestMapping(value = "/memberJoin")
	public String member_Join(){
		System.out.println("회원가입 페이지 입장");		
		return "logInfo/memberJoin";
	}
	
	//회원 등록 메서드
	@RequestMapping(value = "/memberJoin/register", method = RequestMethod.POST)
	public String memberJoinRegister(@ModelAttribute loginVO loginvo){
		//bcrypt 암호화
		loginvo.setUser_pw(BCrypt.hashpw(loginvo.getPassword(), BCrypt.gensalt(10)));		
		
		ms.memberRegisterService(loginvo);
		return "redirect:/login";
	}
	
	//로그아웃 메서드
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(){
		System.out.println("로그아웃 페이지 입장");		
		return "logInfo/login";
	}

}
