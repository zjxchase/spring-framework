package com.yunfan.factory.config;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author yunfan
 * @date 2019/11/19 22:53
 */
public class FactoryBeanConfigTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		System.out.println(applicationContext.getBean("myFactoryBean"));
		System.out.println(applicationContext.getBean("&myFactoryBean"));

	}
}