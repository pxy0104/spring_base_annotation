package com.pxy.service;

import com.pxy.dao.BookDao;
import com.pxy.entity.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.update(book);
    }

    public void deleteBook(int bid) {
        bookDao.delete(bid);
    }

    public int selectBook() {
        return bookDao.findCount();
    }

    //查询返回对象Book
    public Book findOneBook(int bid) {
        return bookDao.findBookInfo(bid);
    }
    public List<Book> selectAllBook(){
        return bookDao.findAllBook();
    }

    public void batchAddBook(List<Object[]> books){
        bookDao.batchAdd(books);
    }

    public void batchDeleteBook(List<Object[]> books){
        bookDao.batchDelete(books);
    }
}
