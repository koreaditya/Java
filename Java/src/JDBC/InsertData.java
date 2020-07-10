package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertData {
    public static void main (String[] args) {
        InsertData insertData = new InsertData();
        insertData.insertCustomerData();
    }
    
    void insertCustomerData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","root");
            PreparedStatement insert=con.prepareStatement("insert into Customer values(?,?,?)");    
            insert.setString(1,"Rohan");
            insert.setString(2,"Mumbai");
            insert.setString(3,"1999-03-24");
            insert.executeUpdate();  
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
