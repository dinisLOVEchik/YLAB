package service.impl;

import service.Application;
import service.Booking;

public class BookingServiceImpl {
    public void addBooking(Booking booking) {
        Application.getInstance().addBooking(booking);
    }

    public void removeBooking(Booking booking) {
        Application.getInstance().removeBooking(booking);
    }

}
