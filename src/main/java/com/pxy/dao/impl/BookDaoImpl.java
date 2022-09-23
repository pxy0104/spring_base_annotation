package com.pxy.dao.impl;

import com.pxy.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl(){
        System.out.println("无参构造");
    }
    public void save() {
        System.out.println("book dao save...");
    }

    private void init() {
        System.out.println("init...");
    }

    private void destroy() {
        System.out.println("destory...");
    }
}
