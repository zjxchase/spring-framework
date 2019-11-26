//package com.yunfan.aop.simple;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import static org.junit.Assert.*;
//
///**
// * @author yunfan
// * @date 2019/11/23 0:15
// */
//public class SimpleAopConfigTest {
//
//	private AnnotationConfigApplicationContext applicationContext;
//
//
//	@Before
//	public void setUp() throws Exception {
//		applicationContext  = new AnnotationConfigApplicationContext(SimpleAopConfig.class);
//		System.out.println("容器创建完成。。。");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		applicationContext.close();
//	}
//
//	@Test
//	public void test() {
//		// 1、不要自己创建对象
//        /*
//        MathCalculator mathCalculator = new MathCalculator();
//        mathCalculator.div(1, 1);
//
//         */
//		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
//		System.out.println(mathCalculator.div(1, 1));
//
//
//	}
//}