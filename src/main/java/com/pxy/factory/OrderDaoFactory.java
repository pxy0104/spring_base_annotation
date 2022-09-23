package com.pxy.factory;

import com.pxy.dao.OrderDao;
import com.pxy.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){

        //第二种方式：静态工厂来实现bean的实例化
        System.out.println("factory setup...");
        return new OrderDaoImpl();
    }
}
