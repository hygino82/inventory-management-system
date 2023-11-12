package dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false", "hygino", "89631139");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
