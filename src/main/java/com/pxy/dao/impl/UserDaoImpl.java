package com.pxy.dao.impl;

import com.pxy.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Value(value = "z3")
    private String userName;

    @Override
    public void add() {
        System.out.println("UserDao的add方法");
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
