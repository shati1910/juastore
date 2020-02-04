package com.juastore.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.juastore.web.domain.Test;

@Service (value="TestService")
public class TestService {
	
	@Resource (name="TestMapper")
	private TestMapper testMapper;
	

	public List<Test> getList() throws Exception {
		return testMapper.getList();
	}
	

	public void insertText(String text) throws Exception {
		testMapper.insertText(text);
	}
}
