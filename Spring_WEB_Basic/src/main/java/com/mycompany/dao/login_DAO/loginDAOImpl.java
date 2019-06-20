package com.mycompany.dao.login_DAO;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.mycompany.vo.loginVO;

@Repository("loginDAOImpl")
public class loginDAOImpl implements loginDAO{
	
	@Inject
	private SqlSession sqlsession;
	
	private static final String NameSpace = "com.mycompany.mapper.mapper_XML";
	//private loginVO loginvo;
	
	@Override
	public loginVO memberConfirm(String user_id) throws SQLException{
		
		return sqlsession.selectOne(NameSpace+".select_userInfo",user_id);
	}
	
	//회원 가입
	@Override
	public void memberRegisterDAO(loginVO login) throws SQLException{
		//insert에는 return값이 없다.
		sqlsession.insert(NameSpace+".insert_memberJoin",login);
	}

}
