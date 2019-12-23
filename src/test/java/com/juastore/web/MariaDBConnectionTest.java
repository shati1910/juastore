package com.juastore.web;

import java.sql.Connection;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MariaDBConnectionTest {
	
	@Resource
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception {
		Connection con = dataSource.getConnection();
		try {
			System.out.println("\n >>>>>>>>>>>>>>>> Connection 출력 : " + con + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) con.close();
		}
	}
	
}
