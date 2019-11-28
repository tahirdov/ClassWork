package Lesson20.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static Connection con;

    public static Connection get() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    System.getenv("PG_PWD")
            );
        }

        return con;
    }

}
