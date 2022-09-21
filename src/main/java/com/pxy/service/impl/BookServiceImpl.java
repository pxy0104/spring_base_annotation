package com.pxy.service.impl;

import com.pxy.service.BookService;
import com.pxy.dao.BookDao;
import com.pxy.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {

    public BookServiceImpl(){
        System.out.println("sss");
    }
    //DI Dependency Injection 删除new关键字
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
