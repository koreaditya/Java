package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RetrieveData {
    public static void main (String[] args) {
        RetrieveData retreivedata = new RetrieveData();
        retreivedata.establishConnection();
    }
    
    void establishConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","root");
            Statement getCustomers = con.createStatement();  
            ResultSet customers = getCustomers.executeQuery("select * from customer");  
            while(customers.next())  
                System.out.println(customers.getString(1)+"  "+customers.getString(2));  
                con.close(); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
