package com.pxy.dao.impl;

import com.pxy.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("user dao save...");
    }
    public void init(){
        System.out.println("init...");
    }
    public void destory(){
        System.out.println("destory...");
    }
}
