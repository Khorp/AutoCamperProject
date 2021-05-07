import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseThing {


    public void makeCustomer(String address,String licensePlate,String name,String phoneNo,int insuranceID,String email) throws ClassNotFoundException {

        try {
            // (1) load the driver into memory

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // (2) establish Connection
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=autocamperRental", "sa", "datamatiker");
            System.out.println("Connection successfully");

            // (3) create the statement
            Statement stmt = con.createStatement();

            int rows = stmt.executeUpdate("INSERT INTO customer VALUES ('"+address+"','"+licensePlate+"','"+name+"','"+phoneNo+"',"+insuranceID+",'"+email+"')");
            //int rows = stmt.executeUpdate("INSERT INTO autoCamper VALUES ('Luxury','AA11111')");

            System.out.println("Records are putted into database");


            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
