package com.pxy.dao.impl;

import com.pxy.dao.BookDao;
import com.pxy.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {

        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getBid(), book.getbName(), book.getbStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    //修改数据库
    @Override
    public void update(Book book) {
        String sql = "update t_book set b_name=?,b_status=? where bid=?";
        Object[] args = {book.getbName(), book.getbStatus(), book.getBid()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(int bookID) {
        String sql = "delete from t_book where bid =?";
        int update = jdbcTemplate.update(sql, bookID);
        System.out.println(update);
    }

    @Override
    public int findCount() {
        String sql = "select COUNT(*) from t_book";
        Integer bookCount = jdbcTemplate.queryForObject(sql, int.class);

        return bookCount;
    }

    @Override
    public Book findBookInfo(int bid) {
        String sql = "select * from t_book where bid = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class),bid);//1.SQL语句
// 2.RowMapper是接口，返回不同的类型数据，使用这个接口里面实现类完成数据封装
        //3.SQL语句值
        return book;
    }

    @Override
    public List<Book> findAllBook() {

        String sql ="select * from t_book";
        List<Book> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
        return list;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql ="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql ="delete from t_book where bid = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.printf(Arrays.toString(ints));
    }

//    @Override
//    public void batchAdd(List<Object[]> book) {
//
//    }

}
