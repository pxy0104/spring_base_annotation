package com.pxy.dao.impl;

import com.pxy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
/*    @Value(value = "z3")
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
    }*/


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username = ?";
        jdbcTemplate.update(sql,100,"Thomas");
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username = ?";
        jdbcTemplate.update(sql,100,"Justin");
    }
}
