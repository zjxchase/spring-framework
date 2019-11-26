//package com.yunfan.configuration.config;
//
//import com.yunfan.configuration.bean.School;
//import com.yunfan.configuration.bean.Teacher;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.support.BeanDefinitionReader;
//import org.springframework.beans.factory.support.BeanDefinitionRegistry;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
///**
// * @author yunfan
// * @date 2019/11/19 23:01
// */
//public class AppConfigTest {
//
//	AnnotationConfigApplicationContext context;
//
//	@Before
//	public void setUp() throws Exception {
//		context = new AnnotationConfigApplicationContext(AppConfig.class);
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
////		System.out.println(context.getBean("user"));
////		System.out.println(context.getBean("teacher"));
//		System.out.println(context.getBean(Teacher.class));
//		System.out.println(context.getBean("school"));
//		System.out.println(context.getBean(School.class));
//	}
//
//
//	@Test
//	public void testBeanDefinitionRegistry() {
//
//		//创建一个简单注册器
//		BeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();
//
//		// 创建bean定义读取器
//		BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
//
//		// 加载配置文件
//		reader.loadBeanDefinitions("spring.xml");
//
//		System.out.println(registry.getBeanDefinitionNames().length);
//		// 从注册器中获取bean定义
//		BeanDefinition beanDefinition = registry.getBeanDefinition("user");
//
//		System.out.println(beanDefinition);
//
//		// 创建bean工厂
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		// bean工厂注册bean定义
//		beanFactory.registerBeanDefinition("user", beanDefinition);
//
//		System.out.println(beanFactory.getBean("user"));
//
//	}
//
//	@Test
//	public void testFactory() {
//
//		//创建一个简单注册器
//		BeanDefinitionRegistry registry = new DefaultListableBeanFactory();
//
//		// 创建bean定义读取器
//		BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
//
//		// 加载配置文件
//		reader.loadBeanDefinitions("spring.xml");
//
//		System.out.println(registry.getBeanDefinitionNames().length);
//		// 从注册器中获取bean定义
//		BeanDefinition beanDefinition = registry.getBeanDefinition("user");
//		System.out.println(beanDefinition);
//
//		System.out.println(((DefaultListableBeanFactory) registry).getBean("user"));
//	}
//}