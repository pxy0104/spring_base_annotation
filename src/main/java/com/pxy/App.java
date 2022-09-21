package com.pxy;

import com.pxy.service.BookService;
import com.pxy.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookService");

//        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
