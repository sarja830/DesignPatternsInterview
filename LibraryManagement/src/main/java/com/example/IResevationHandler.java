package com.example;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public interface IResevationHandler {
    boolean createReservation(List<BookItem> bookItems, List<Date> startDates, List<Date> endDates, Account borrower);
    boolean cancelReservation();
    boolean returnBook();
}
