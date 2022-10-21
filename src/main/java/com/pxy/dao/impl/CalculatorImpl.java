package com.pxy.dao.impl;

import com.pxy.dao.ICalculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class CalculatorImpl implements ICalculator {
    @Value("${migicNum}")
    private int migicNum;
    @Value("${res}")
    private String res;


    @PostConstruct
    public void init() {
        System.out.println("init....");
    }

    public int getMigicNum() {
        return migicNum;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }

    public void setMigicNum(int migicNum) {
        this.migicNum = migicNum;
    }

    @Override
    public void add(int a, int c) {
        int b = a + c;
        System.out.println(b + '\n' + res + migicNum);
    }

    @Override
    public void multiply(int a, int c) {
        int b = a * c;
        System.out.println(b);
    }

    @Override
    public void minus(int a, int c) {
        int b = a - c;
        System.out.println(b);
    }

    @Override
    public void division(int a, int c) {
        int b = a / c;
        System.out.println(b);
    }
}
