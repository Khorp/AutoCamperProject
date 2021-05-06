import java.util.List;

/***
 * @since 03/05/2021
 */
public class Booking {

    private String bookingWeeks;
    private int bookingID;

    /**
     * Get price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * get what autoCamper that is booked
     * @return bookedAutoCamper
     */
    public String getAutoCamperBooked() {
        return autoCamperBooked;
    }

    private double price;
    private String autoCamperBooked;
    private List<Customer> customersList;

    /**
     * Constructor for booking
     * @param bookingWeeks BookingWeeks Ex: 13-23
     * @param bookingID ID of booking
     * @param price price for the booking
     * @param autoCamperBooked what autoCamper is booked
     */
    public Booking(String bookingWeeks, int bookingID,double price,String autoCamperBooked) {
        this.bookingWeeks = bookingWeeks;
        this.bookingID = bookingID;
        this.price = price;
        this.autoCamperBooked = autoCamperBooked;
    }

    /**
     * getter for bookingWeek
     * @return bookingWeek String
     */
    public String getBookingWeeks() {
        return bookingWeeks;
    }

    /**
     * Set bookingWeeks
     * @param bookingWeeks sets bookingWeeks
     */
    public void setBookingWeeks(String bookingWeeks) {
        this.bookingWeeks = bookingWeeks;
    }

    /***
     * gets bookingID
     * @return BookingID
     */
    public int getBookingID() {
        return bookingID;
    }

    /***
     * sets bookingID
     * @param bookingID set bookingID
     */
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

}
