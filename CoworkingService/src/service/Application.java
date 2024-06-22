package service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    private static final Application INSTANCE = new Application();
    private final List<Booking> bookings = new ArrayList<>();
    private List<Resource> resources = new ArrayList<>();

    private Application() {
    }

    public static Application getInstance() {
        return INSTANCE;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public void addWorkspace(Workspace workspace) {
        resources.add(workspace);
    }

    public void addRoom(MeetingRoom room) {
        resources.add(room);
    }

    public List<Booking> getBookingsByDate(LocalDateTime date) {
        return bookings.stream()
                .filter(booking -> booking.getStartDate().equals(date) || booking.getEndTime().equals(date))
                .collect(Collectors.toList());
    }

    public List<Booking> getBookingsByUser(User user) {
        List<Booking> bookingList = new ArrayList<>();
        for (Booking booking : bookings){
            if (booking.getUser().equals(user)){
                bookingList.add(booking);
            }
        }
        return bookingList;
    }

    public List<Booking> getBookingsByResource(Resource resource) {
        return bookings.stream()
                .filter(booking -> booking.getResource().equals(resource))
                .collect(Collectors.toList());
    }
    public List<Booking> getAllBookings(){
        return bookings;
    }
}
