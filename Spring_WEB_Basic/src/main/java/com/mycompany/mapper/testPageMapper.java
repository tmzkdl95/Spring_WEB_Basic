package com.mycompany.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mycompany.vo.testPage;


public interface testPageMapper {
	@Select("select * from testpage")
	public List<testPage> getList_testpage();
}
