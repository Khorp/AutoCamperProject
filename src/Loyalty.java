/**
 * @Since 03/05/2021
 */
public class Loyalty {

    /**
     * Enum for Loyalty
     */
    private enum LoyaltyTypeEnum {
        noDiscount,
        moderateDiscount,
        ultraDiscount
    }

    private LoyaltyTypeEnum LoyaltyType;
    private int loyaltyID;

    /**
     *  Constructor
     * @param loyaltyID
     */
    public Loyalty(int loyaltyID){
        this.loyaltyID = loyaltyID;
    }

    /**
     * get for LoyaltyType
     * @return
     */
    public LoyaltyTypeEnum getLoyaltyType() {
        return LoyaltyType;
    }

    /**
     * set LoyaltyType
     * @param loyaltyType
     */
    public void setLoyaltyType(LoyaltyTypeEnum loyaltyType) {
        LoyaltyType = loyaltyType;
    }

    /**
     * get for loyaltyID
     * @return
     */
    public int getLoyaltyID() {
        return loyaltyID;
    }

    /**
     * set loyaltyID
     * @param loyaltyID
     */
    public void setLoyaltyID(int loyaltyID) {
        this.loyaltyID = loyaltyID;
    }
}
