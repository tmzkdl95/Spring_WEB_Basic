package com.mycompany.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.mapper.testPageMapper;
import com.mycompany.vo.testPage;

@Controller
public class testPageController {
	
	@Autowired
	private testPageMapper testpagemapper;
	
	@RequestMapping(value = "/testPage", method = RequestMethod.GET)
	
	//DB 출력 동작 메서드
	public String testPage_print(Model model){
		//<> 안에 DTO or VO 이름
		List<testPage> testpage = testpagemapper.getList_testpage();
		
		//model을 통해 View로 전달
		model.addAttribute("testpage",testpage);
		
		return "testPage/testpage";
	}
	

}
