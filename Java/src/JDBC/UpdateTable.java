package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateTable {
    public static void main (String[] args) {
        UpdateTable updatedata = new UpdateTable();
        updatedata.updateData();
    }
    
    void updateData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","root");
            PreparedStatement update=con.prepareStatement("update orders\r\n" + 
                                                          "inner join customers \r\n" + 
                                                          "on orders.cutomerId = customers.id\r\n" + 
                                                          "set orders.completed = ? \r\n" + 
                                                          "where customers.joiningDate > ?");    
            update.setBoolean(1, true);
            update.setString(2, "2019-04-05");
            update.executeUpdate();  
            con.close();
            System.out.println("Complete");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
