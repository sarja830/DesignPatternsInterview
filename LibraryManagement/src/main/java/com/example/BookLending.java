package com.example;

import java.util.Date;

public class BookLending {
    private BookItem bookItem;

    private Date start;
    private Date end;
    private Status status;

    public BookLending(BookItem bookItem, Date start, Date end, Status status) {
        this.bookItem = bookItem;
        this.start = start;
        this.end = end;
        this.status = status;
    }
}
