//package com.yunfan.aop.simple;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//
//import java.util.Arrays;
//
///**
// * 切面类
// * @author yunfan
// * @date 2019/10/24 23:23
// */
//@Aspect
//public class LogAspects {
//
//    /**
//     * 抽取公共的切入点表达式
//     * 1、本类引用(只需要写方法名)
//     * 2、其他的切面引用需要类全名（包含包名）
//     */
////    @Pointcut("execution(public int com.yunfan.aop.simple.MathCalculator.div(int, int))")
//    @Pointcut("execution(public int com.yunfan.aop.simple.MathCalculator.*(..))")
//    public void pointCut() {};
//
//    // 注意：JoinPoint 一定要放到方法参数的第一位
//    //@Before 在目标方法之前切入，切入点表达式（指定在哪个方法切入）
////    @Before("public int com.yunfan.aop.simple.MathCalculator.div(int, int)")
////    @Before("public int com.yunfan.aop.simple.MathCalculator.*(..)")
//    @Before("pointCut()")
//    public void logStart(JoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//
//        System.out.println(joinPoint.getSignature().getName() + "除法运行。。。@Before:参数列表时：{" + Arrays.asList(args) + "}");
//    }
//
////    @After("public int com.yunfan.aop.simple.MathCalculator.*(..)")
//    @After("com.yunfan.aop.simple.LogAspects.pointCut()")
//    public void logEnd() {
//        System.out.println("@After除法结束。。。");
//    }
//
//    @AfterReturning(value = "pointCut()", returning = "result")
//    public void logReturn(Object result) {
//        System.out.println("除法正常返回。。。@AfterReturning运行结果：{" + result +"}");
//    }
//
//    @AfterThrowing(value = "pointCut()", throwing = "exception")
//    public void logException(Exception exception) {
//        System.out.println("除法异常。。。@AfterThrowing异常信息： {" + exception + "}");
//    }
//
//}
