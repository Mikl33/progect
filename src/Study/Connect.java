package Study;

import java.sql.*;

public class Connect {

    //  String className = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://127.0.0.1:5432/newbd";
    private final String user = "postgres";
    private final String pass = "user";

    private Connection connection;

    public Connect() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
