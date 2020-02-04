package com.juastore.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juastore.web.domain.Test;
import com.juastore.web.function.Common;
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
	
	@RequestMapping(value="input")
	public String inputTest(HttpServletRequest request, Model model) throws Exception {
		Common common = new Common();
		String text = common.ReplaceChar(request.getParameter("text"));
		
		testService.insertText(text);
		
		model.addAttribute("msg", "등록완료");
		model.addAttribute("url", "/test/sqlTest");
		model.addAttribute(text);
		return "/common/redirect";
	}
}
