/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineBookOrderSystem;

/**
 *
 * @author Aya
 */

import java.sql.*;
public class connect_database {

    private static connect_database instance;
    private Connection connection;
    private Statement statement;

    private connect_database() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static connect_database getInstance(){
        if(instance==null){
            instance = new connect_database();
        }
        return instance;
    }


    public  ResultSet retrivedata(String query) throws SQLException {
        ResultSet rs =null;      
        rs=statement.executeQuery(query);
        return rs;
    }
    public  void queurydata(String query) throws SQLException {
        statement.executeUpdate(query);
    }
    
}






