package com.pxy;

import com.pxy.dao.UserDao;
import com.pxy.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDaoImpl userDao = (UserDaoImpl) ctx.getBean("userDao");
//        userDao.save();
        UserDaoImpl userDao = (UserDaoImpl) ctx.getBean("userDao");
        userDao.save();
    }
}
