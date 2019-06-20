package com.mycompany.dao.login_DAO;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.vo.loginVO;

public interface loginDAO {
	
	//로그인 확인
	public loginVO memberConfirm(String user_id)throws SQLException;
	
	//회원가입
	public void memberRegisterDAO(loginVO loginvo) throws SQLException;


}
