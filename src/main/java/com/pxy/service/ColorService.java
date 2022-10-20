package com.pxy.service;

import com.pxy.dao.impl.ColorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {
    @Autowired
    private ColorImpl color;

    public void showColor() {
        color.showColor();
    }
}
