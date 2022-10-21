package com.meta.shop;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTests {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con = 
				DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/app?serverTimezone=Asia/Seoul",
						"root",
						"admin")){
			System.out.println(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
}