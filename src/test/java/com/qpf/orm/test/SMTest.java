package com.qpf.orm.test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import com.qpf.model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qpf.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SMTest {
	@Autowired
	private UserService userService;
	private Logger logger = Logger.getLogger(getClass());
	@Test
	public void selectAll() throws IOException {
		System.out.println(111);
		InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();
		properties.load(is);
		String url = properties.getProperty("sqlite.url");
		System.out.println(url);
	}
	@Test
	public void selectAllUser() {
//		User user = userService.getUser(1);
		logger.info(userService.getAllUser());
	}

	@Test
	public void insertUser(){
		logger.info(userService.insertUser(new User("shadaileng", 26, 1, "199248", "qpf0510@qq.com", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))));
	}
}
