package com.yunfan.configuration.config;

import com.yunfan.configuration.bean.School;
import com.yunfan.configuration.bean.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yunfan
 * @date 2019/11/19 23:01
 */
public class AppConfigTest {

	AnnotationConfigApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		System.out.println(context.getBean("user"));
//		System.out.println(context.getBean("teacher"));
		System.out.println(context.getBean(Teacher.class));
		System.out.println(context.getBean("school"));
	}
}