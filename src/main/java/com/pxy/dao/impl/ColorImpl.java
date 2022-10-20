package com.pxy.dao.impl;

import com.pxy.dao.IColor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class ColorImpl implements IColor {
    @Override
    public void showColor() {
        System.out.println("This is the purple");
    }
}
