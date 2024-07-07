package com.example;

import java.util.Date;

public class BookItem extends Book{
    private int version;

    private String barcode;

    private Status status;

    private Date borrowedDate;
    private Date dueDate;

    private Rack rack;

    public Rack getRack() {
        return rack;
    }

    public int getVersion() {
        return version;
    }

    public String getBarcode() {
        return barcode;
    }

    public Status getStatus() {
        return status;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
