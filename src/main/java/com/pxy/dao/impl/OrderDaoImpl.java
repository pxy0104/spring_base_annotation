package com.pxy.dao.impl;

import com.pxy.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order save ...");
    }
}
