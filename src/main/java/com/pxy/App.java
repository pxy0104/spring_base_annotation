package com.pxy;

import com.pxy.service.BookService;
import com.pxy.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
