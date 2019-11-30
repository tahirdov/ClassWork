package Lesson20.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseApp {
    public static void main(String[] args) throws SQLException {
        Connection con = DB_Connection.get();

        String n = "Jim";
        String mail = "jim@gmail.com";
        String SQL = "insert into users (name, email) values (?, ?)";
        PreparedStatement psd = con.prepareStatement(SQL);
        psd.setString(1, "Rose");
        psd.setString(2, "rose@gmail.com");
        psd.execute();


    }

}
