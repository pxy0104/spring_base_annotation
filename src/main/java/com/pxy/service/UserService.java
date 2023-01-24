package com.pxy.service;

import com.pxy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.plaf.basic.BasicBorders;


//默认是首字母小写，可以不写属性值
@Transactional
@Service(value = "userService")
public class UserService {
//注解无需set方法，注解底层自带

/*
//    @Resource
@Autowired //根据类型自动注入  可以@Qualifier一起使用,当接口UserDao有多个实现类时，每个类的注解须实现value，须根据具体的名称来注入
@Qualifier(value = "userDao")
    private UserDao userDao;
    public void add(){
        userDao.add();
        System.out.println("UserService类的add方法");
    }
*/


    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        userDao.reduceMoney();


        int ex = 1/0;  // 断电断网等意外


        userDao.addMoney();
    }


}
