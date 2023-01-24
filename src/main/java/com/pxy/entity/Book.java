package com.pxy.entity;

public class Book {
    //SQL 表尽量不要b_id !!! shit
    private int bid;
    private String bName;
    private String bStatus;

    public Book() {
    }

    public Book(int bid, String bName, String bStatus) {
        this.bid = bid;
        this.bName = bName;
        this.bStatus = bStatus;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbStatus() {
        return bStatus;
    }

    public void setbStatus(String bStatus) {
        this.bStatus = bStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bID=" + bid +
                ", bName='" + bName + '\'' +
                ", bStatus='" + bStatus + '\'' +
                '}';
    }
}
