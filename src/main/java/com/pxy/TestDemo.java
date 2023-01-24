package com.pxy;


import com.pxy.aopanno.User;
import com.pxy.config.SpringConfig;
import com.pxy.config.TxConfig;
import com.pxy.dao.UserDao;
import com.pxy.entity.Book;
import com.pxy.service.BookService;
import com.pxy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
//    @Test
//    public void test1() {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicnContext.xml.bak");
//        UserService userService = ctx.getBean("userService", UserService.class);
//        System.out.println(userService);
//        userService.add();
//    }
//
//    @Test
//    public void testUserDao() {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applitionContext.xml.bak");
//
//        UserDao userDao = ctx.getBean("userDao", UserDao.class);
//        System.out.println(userDao);
//
//
//    }
//
//    @Test
//    public void testTotalConfig() {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserService userService = ctx.getBean("userService", UserService.class);
//        System.out.println(userService);
//        System.out.println();
//        userService.add();
//
//        UserDao userDao = ctx.getBean("userDao", UserDao.class);
//        userDao.toString();
//    }

    @Test
    public void testAop() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = ctx.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAddBook() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        Book book = new Book(0, "java", "over");
        bookService.addBook(book);
    }

    @Test
    public void testUpdateBook() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        Book book = new Book(2, "li4", "worst");
        bookService.updateBook(book);
    }

    @Test
    public void testDeleteBook() {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        Book book = new Book(14, "li4", "worst");
        bookService.deleteBook(book.getBid());
    }

    @Test
    public void testSelectBook() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        int count = bookService.selectBook();
        System.out.println(count);
    }

    @Test
    public void testRetBook() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        Book retBook = bookService.findOneBook(1);
        System.out.println(retBook);

    }

    @Test
    public void testFindAllBook() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        List<Book> books = bookService.selectAllBook();
        System.out.println(books);
    }

    @Test
    public void testBatchAdd() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {0, "c++", "easy"};
        Object[] o2 = {0, "c--", "hard"};
        Object[] o3 = {0, "cplus", "common"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        bookService.batchAddBook(batchArgs);
    }
    @Test
    public void testBatchDelete() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {11};
        Object[] o2 = {9};
        Object[] o3 = {10};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        bookService.batchDeleteBook(batchArgs);
    }


    @Test
    public void testAccount(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.accountMoney();
    }



}


