package com.pxy.dao.impl;

import com.pxy.dao.BookDao;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.List;

public class BookDaoImpl implements BookDao {

    private String name;
    private int age;
    private List<String> list;
    public BookDaoImpl(){
        System.out.println("无参构造");
    }
    public void save() {
        System.out.println("book dao save..."+ name + age);
        for (String s : list) {
            System.out.println(s);
        }
    }

    private void init() {
        System.out.println("init...");
    }

    private void destroy() {
        System.out.println("destory...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setList(List list) {
        this.list=list;
    }
}
