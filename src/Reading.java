/**
 *
 * @since 03/05/2021
 */
public class Reading {

    private int readingID;
    private int kmStatus;

    /**
     * reading constructor
     * @param readingID readingID
     * @param kmStatus how many kilometers the autoCamper has driven
     */
    public Reading(int readingID,int kmStatus){
        this.readingID = readingID;
        this.kmStatus = kmStatus;
    }
}
