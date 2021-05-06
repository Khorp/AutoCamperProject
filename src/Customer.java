/**
 * @Since 03/05/2021
 */
public class Customer {

    private String address;
    private String phoneNO;
    private String email;
    private String driverLicense;
    private int customerID;
    private String name;

    /***
     * Constructor
     * @param name CustomerName
     * @param address CustomerAddress
     * @param phoneNO CustomerPhoneNo
     * @param email CustomerEmail
     * @param driverLicense CustomerDriverLicense
     * @param customerID CustomerID
     */
    public Customer(String name,String address,String phoneNO,String email,String driverLicense,int customerID){
        this.name = name;
        this.address = address;
        this.phoneNO = phoneNO;
        this.email = email;
        this.driverLicense = driverLicense;
        this.customerID = customerID;
    }
}
