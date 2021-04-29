public class Customer {

    private String address;
    private String phoneNO;
    private String email;
    private String driverLicense;
    private int customerID;

    public Customer(String name,String address,String phoneNO,String email,String driverLicense,int customerID){
        this.name = name;
        this.address = address;
        this.phoneNO = phoneNO;
        this.email = email;
        this.driverLicense = driverLicense;
        this.customerID = customerID;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }



}
