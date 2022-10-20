//package com.pxy.service.impl;
//
//import com.pxy.service.BookService;
//import com.pxy.dao.BookDao;
//import com.pxy.dao.impl.BookDaoImpl;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//
//public class BookServiceImpl implements BookService, DisposableBean, InitializingBean {
//
//    //DI Dependency Injection 删除new关键字
//    private BookDao bookDao;
//
//    public void save() {
//        System.out.println("book service save...");
//        bookDao.save();
//    }
//
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("service destroy");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afer set");
//    }
//}
