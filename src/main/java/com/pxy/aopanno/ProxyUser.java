package com.pxy.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//增强类
@Component
@Aspect //生成代理对象
public class ProxyUser {

//    抽取相同的切入点
    @Pointcut(value = "execution(* com.pxy.aopanno.*.*(..))")
    public void pointdemo(){
    }
    @Before(value="pointdemo()")
    public void before(){
        System.out.println("前置通知方法");
    }
    @AfterReturning(value="pointdemo()")
    public void afterReturning(){
        System.out.println("AfterReturning方法");
    }
    @After(value="pointdemo()")
    public void after(){
        System.out.println("after...方法");
    }

    @AfterThrowing(value="pointdemo()")
    public void afterThrowing(){
        System.out.println("AfterThrowing通知方法");
    }


    @Around(value="pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");
    }
}
