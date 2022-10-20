package com.pxy;

import com.pxy.config.SpringConfig;
import com.pxy.dao.impl.CalculatorImpl;
import com.pxy.dao.impl.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        CalculatorImpl calculator = ctx.getBean(CalculatorImpl.class);
        Student student = ctx.getBean(Student.class);

        student.talk();
        ctx.close();


    }

}
