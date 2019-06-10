package com.mycompany.service.testPageService;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mycompany.dao.testPage_DAO.testPageDAO;
import com.mycompany.vo.testPage;

@Service
public class testPage_ServiceImpl implements testPage_Service{

	@Inject
	testPageDAO testPagedao;
	
	@Override
	public List<testPage> printDB() {
		System.out.println("testPage_service ½ÇÇà");
		List<testPage> test = testPagedao.getList_testpage();
		return test;
	}

	

}
