package com.pxy.dao.impl;

import com.pxy.dao.Anno;
import org.springframework.stereotype.Component;
@Component(value = "annoImpl")
public class AnnoImpl implements Anno {
    @Override
    public void save() {
        System.out.println("save...anno");
    }
}
