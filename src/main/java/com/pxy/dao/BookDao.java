package com.pxy.dao;

import com.pxy.entity.Book;

import java.util.List;

//JDBCTemplate 演示
public interface BookDao {
    void add(Book book);

    //修改数据库
    void update(Book book);

    //根据id删除
    void delete(int bookID);
    //查询返回行数
    int findCount();

    Book findBookInfo(int bID);

    //分页多项数据查询
    List<Book> findAllBook();

    //批量添加与删除
    void batchAdd(List<Object[]> book);

    void batchDelete(List<Object[]> books);
}
