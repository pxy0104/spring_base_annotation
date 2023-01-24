package com.pxy;

import com.pxy.config.SpringConfig;
import com.pxy.entity.Book;
import com.pxy.service.BookService;
import com.pxy.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
//JunitTest5测试 使用
@SpringJUnitConfig(classes = SpringConfig.class)
public class TestJunit4 {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;
    @Test
    public void test1() {
        List<Book> books = bookService.selectAllBook();
//        userService.accountMoney();
        System.out.println(books);
    }

}
