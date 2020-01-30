package com.juastore.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juastore.web.domain.Test;
import com.juastore.web.service.TestService;

@Controller
@RequestMapping("/test/")
public class TestController {
	
	@Resource (name="TestService")
	private TestService testService;
	
	//sqlTest 페이지
	@RequestMapping(value="sqlTest")
	public String mybatisTest(Model model) throws Exception {
		
		List<Test> testList = testService.getList();
		model.addAttribute(testList);
		
		return "test/sqlTest";
	}
}
