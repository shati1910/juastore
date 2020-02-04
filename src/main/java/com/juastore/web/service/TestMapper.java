package com.juastore.web.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.juastore.web.domain.Test;

@Repository (value="TestMapper")
public interface TestMapper {
	public List<Test> getList() throws Exception;
	public void insertText(String text) throws Exception;
}
