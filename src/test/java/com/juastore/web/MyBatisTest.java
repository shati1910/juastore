package com.juastore.web;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {
	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testFactory() {
		System.out.println("\n >>>>>>>>>>>>> sqlFactory 출력 : "+ sqlSessionFactory);
	}
	
	@Test
	public void testSession() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			System.out.println("\n >>>>>>>>>>>>>> session 출력 : " + session + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
	}
}
