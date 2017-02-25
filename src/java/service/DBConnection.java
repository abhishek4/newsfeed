package service;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {
	
    private static final String conString = "jdbc:mysql://localhost:3306/newsfeed";
    private static final String dbuser = "root";
    private static final String dbpass = "abhi109";

    public static ArrayList<Object> getResults(String query) {
        ArrayList<Object> data = new ArrayList<>();
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection(conString, dbuser, dbpass);
            Statement stmt=con.createStatement();  
            ResultSet result=stmt.executeQuery(query);

            if (!result.next()) {
                return data;
            } else {
                int index = 0;
                while(result.next()) {
                    data.add(result.getObject(index));
                    index++;
                }
            }
            con.close();			
        } catch(Exception e) { 
            System.out.println(e);
        }
        return data;
    } 
}
