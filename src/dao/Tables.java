package dao;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = ConnectionProvider.getCon();
            st = conn.createStatement();
            String createTable = """
                         create table appuser(
                         appuser_pk int auto_increment primary key, 
                         userRole varchar(50),
                         email varchar(50),
                         address varchar(50), 
                         name varchar(200), 
                         mobileNumber varchar(50), 
                         password varchar(200),
                         status varchar(50)); 
                         """;

            String addUser = """
                              insert into appuser (userRole,name,mobileNumber,email,password,address,status)
                              values ('SuperAdmin','Super Admin','12345','super@getmail.com','addmin','Brazil','true');
                              """;
            st.executeUpdate(addUser);
            JOptionPane.showMessageDialog(null, "Insert data Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                conn.close();
                st.close();
            } catch (Exception ex) {

            }
        }
    }
}
