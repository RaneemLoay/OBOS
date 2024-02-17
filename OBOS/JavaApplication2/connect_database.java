
import java.sql.*;
public class connect_database {

    private static connect_database instance;
    private Connection connection;
    private Statement statement;

    private connect_database() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");
            statement = connection.createStatement();
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

//    public void insert_category() {
//        try {
//            statement.execute("INSERT INTO category (name) values('classics')");
//            System.out.println("inserted successfully");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void show_categories() throws SQLException {
//        String s ="select * from category";
//        ResultSet r =statement.executeQuery(s);
//        while (r.next()){
//            System.out.println("category name :" + r.getString(2));
//        }
//    }
}



import java.sql.*;
public class connect_database {

    private static connect_database instance;
    private Connection connection;
    private Statement statement;

    private connect_database() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");
            statement = connection.createStatement();
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

//    public void insert_category() {
//        try {
//            statement.execute("INSERT INTO category (name) values('classics')");
//            System.out.println("inserted successfully");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void show_categories() throws SQLException {
//        String s ="select * from category";
//        ResultSet r =statement.executeQuery(s);
//        while (r.next()){
//            System.out.println("category name :" + r.getString(2));
//        }
//    }
}


