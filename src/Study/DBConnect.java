package Study;

import java.sql.*;
import java.sql.Driver;

public class DBConnect {

    //  String className = "org.postgresql.Driver";
    // private final String url = "jdbc:postgresql://127.0.0.1:5432/newbd";
    // private final String user = "postgres";
    // private final String pass = "user";

    private Connection connection;

    public DBConnect() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
    }
        public Connection getConnection (String url, String user, String pass) throws SQLException {
            if (connection != null)
                return connection;
            connection = DriverManager.getConnection(url, user, pass);
            return connection;
        }
    }
      /* connection = DriverManager.getConnection();
        } catch (SQLException e) {
            System.out.println("Ошибка при подключение к БД");
            e.printStackTrace();
        } catch (ClassNotFoundException pe){
            System.out.println("Нет Драйвера для PostgreSQL");
            pe.getStackTrace();
        }*/




    /*public Connection getConnection(String url, String user, String pass) {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}*/
