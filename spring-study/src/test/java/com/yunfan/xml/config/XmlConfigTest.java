package com.yunfan.xml.config;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author yunfan
 * @date 2019/11/19 22:43
 */
public class XmlConfigTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConfig() {

		System.out.println(applicationContext.getBean("user"));
	}
}