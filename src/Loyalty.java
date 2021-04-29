public class Loyalty {

    private enum LoyaltyTypeEnum {
        noDiscount,
        moderateDiscount,
        ultraDiscount
    }

    private LoyaltyTypeEnum LoyaltyType;
    private int loyaltyID;

    public Loyalty(int loyaltyID){
        this.loyaltyID = loyaltyID;
    }

    public LoyaltyTypeEnum getLoyaltyType() {
        return LoyaltyType;
    }

    public void setLoyaltyType(LoyaltyTypeEnum loyaltyType) {
        LoyaltyType = loyaltyType;
    }

    public int getLoyaltyID() {
        return loyaltyID;
    }

    public void setLoyaltyID(int loyaltyID) {
        this.loyaltyID = loyaltyID;
    }
}
