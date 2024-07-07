package com.example;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ReservationHandler implements  IResevationHandler {

    private static final List<Reservation> reservations = new LinkedList<>();

    @Override
    public boolean createReservation(List<BookItem> bookItems, List<Date> startDates, List<Date> endDates, Account borrower) {
            List<BookLending> bookLendings= new LinkedList<>();
            for(int i=0;i<bookItems.size();i++) {
                BookItem bookItem = bookItems.get(i);
                if(bookItem.getStatus()==Status.AVAILABLE) {
                    BookLending bookLending = new BookLending(bookItem, startDates.get(i), endDates.get(i),Status.RESERVED);
                    bookLendings.add(bookLending);
                }
            }
            Reservation reservation = new Reservation(bookLendings, borrower);
            reservations.add(reservation);
            return true;
    }

    @Override
    public boolean cancelReservation() {
        return true;
    }

    @Override
    public boolean returnBook() {
        return true;
    }


}

