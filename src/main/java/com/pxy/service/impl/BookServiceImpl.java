package com.pxy.service.impl;

import com.pxy.service.BookService;
import com.pxy.dao.BookDao;
import com.pxy.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {
    private BookDao bookDao =  new BookDaoImpl();

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
