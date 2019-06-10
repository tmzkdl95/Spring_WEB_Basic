package com.mycompany.dao.testPage_DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.vo.testPage;

@Repository
public class testPageDAOImpl implements testPageDAO{

	@Inject
	private SqlSession sqlsession;
	
	private static final String NameSpace = "com.mycompany.mapper.mapper_XML";
	@Override
	public List<testPage> getList_testpage() {
		
		System.out.println("testPageDAO ½ÇÇà");
		return sqlsession.selectList(NameSpace+".select_testPage");
	}

}
