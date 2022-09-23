package com.pxy.factory;

import com.pxy.dao.UserDao;
import com.pxy.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
