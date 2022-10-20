package com.pxy.dao.impl;

import com.pxy.dao.IPerson;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student implements IPerson {
    private String name;
    private int age;
    private int num;
    @PostConstruct
    public void init(){
        System.out.println("学生注册成功");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("学生退学");
    }
    @Override
    public void talk() {
        System.out.println("学生之间交流");
    }

    @Override
    public void run() {
        System.out.println("学生可以跑操");
    }

    @Override
    public void work() {
        System.out.println("学生应该学习");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
