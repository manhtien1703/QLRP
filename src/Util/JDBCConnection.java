package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLRP;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sadboi";
    private static final String PASSWORD = "190303";

    public static Connection getJDBCConnection() {
        try {
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish the connection
            return DriverManager.getConnection( URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
