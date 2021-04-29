import java.util.List;

public class Booking {

    private String bookingWeeks;
    private int bookingID;
    private List<Customer> customersList;

    public Booking(String bookingWeeks, int bookingID) {
        this.bookingWeeks = bookingWeeks;
        this.bookingID = bookingID;
    }

    public String getBookingWeeks() {
        return bookingWeeks;
    }

    public void setBookingWeeks(String bookingWeeks) {
        this.bookingWeeks = bookingWeeks;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

}
