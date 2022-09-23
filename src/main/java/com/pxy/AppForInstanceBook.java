package com.pxy;

import com.pxy.dao.BookDao;
import com.pxy.dao.OrderDao;
import com.pxy.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDaoImpl orderDao = (BookDaoImpl) ctx.getBean("bookDao");
        orderDao.save();
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
