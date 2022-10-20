package com.pxy.service;

import com.pxy.dao.impl.CalculatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MutilCalCulator {
    @Autowired
    public CalculatorImpl calculator;

    public void addAndmuti(){
        calculator.add(1,2);
    }
}
