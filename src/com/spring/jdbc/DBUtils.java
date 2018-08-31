package com.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBUtils {

	private JdbcTemplate jdbcTemplate;
	private ApplicationContext context;
 
    {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }
	
	@Test
	public void testSave() {
		String sql = "insert into mangers values(?,?,?)";
		jdbcTemplate.update(sql, 4, "TOM", "a123");
	}
}
