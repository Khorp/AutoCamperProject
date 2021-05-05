import java.util.List;

public class Booking {

    private String bookingWeeks;
    private int bookingID;

    public double getPrice() {
        return price;
    }

    public String getAutoCamperBooked() {
        return autoCamperBooked;
    }

    private double price;
    private String autoCamperBooked;
    private List<Customer> customersList;

    public Booking(String bookingWeeks, int bookingID,double price,String autoCamperBooked) {
        this.bookingWeeks = bookingWeeks;
        this.bookingID = bookingID;
        this.price = price;
        this.autoCamperBooked = autoCamperBooked;
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
