import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseThing {


    public static void main(String args[]) throws ClassNotFoundException {

        try {
            // (1) load the driver into memory

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // (2) establish Connection
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=autocamperRental", "sa", "datamatiker");
            System.out.println("Connection successfully");

            // (3) create the statement
            Statement stmt = con.createStatement();

            // int rows = stmt.executeUpdate("INSERT INTO customer VALUES ('test adresse','BC69495',null,'Nicolaj Hansen','28894929',1,'nicolajhansen97@live.dk')");

            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
