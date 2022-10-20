package com.pxy.dao.impl;

import com.pxy.dao.ICalculator;
import org.springframework.stereotype.Repository;

@Repository
public class CalculatorImpl implements ICalculator {

    @Override
    public void add(int a,int c) {
        int b= a+c;
        System.out.println(b);
    }

    @Override
    public void multiply(int a, int c) {
        int b = a*c;
        System.out.println(b);
    }

    @Override
    public void minus(int a, int c) {
        int b = a-c;
        System.out.println(b);
    }

    @Override
    public void division(int a, int c) {
        int b = a/c;
        System.out.println(b);
    }
}
