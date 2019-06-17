package com.mycompany.dao.login_DAO;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.vo.loginVO;

@Repository
public class loginDAOImpl implements loginDAO{
	
	@Inject
	private SqlSession sqlsession;
	
	private static final String NameSpace = "com.mycompany.mapper.mapper_XML";
	private loginVO loginvo;
	
	@Override
	public List<loginVO> memberConfirm(String user_id){
		
		return sqlsession.selectList(NameSpace+".select_userInfo");
	}
	
	//회원 가입
	@Override
	public void memberRegisterDAO(loginVO login){
		//insert에는 return값이 없다.
		sqlsession.insert(NameSpace+".insert_memberJoin",login);
	}

}
