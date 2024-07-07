package com.example;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Reservation {
    List<BookLending> bookLendings;
    private Account borrower;
    private int id;

    public Reservation(List<BookLending> bookLendings, Account borrower) {
        this.bookLendings = bookLendings;
        this.borrower = borrower;
    }


}
