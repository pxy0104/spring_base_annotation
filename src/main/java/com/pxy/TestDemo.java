package com.pxy;


import com.pxy.config.SpringConfig;
import com.pxy.dao.UserDao;
import com.pxy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pxy.aopanno.User;

public class TestDemo {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicnContext.xml.bak");
        UserService userService = ctx.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testUserDao() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applitionContext.xml.bak");

        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        System.out.println(userDao);


    }

    @Test
    public void testTotalConfig() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean("userService", UserService.class);
        System.out.println(userService);
        System.out.println();
        userService.add();

        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        userDao.toString();
    }

    @Test
    public void testAop() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = ctx.getBean("user", User.class);
        user.add();
    }
}


