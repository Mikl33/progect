package Study;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Runer {


    private static final String url = "jdbc:postgresql://127.0.0.1:5432/newbd";
    private static final String user = "postgres";
    private static final String pass = "user";

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        DBConnect db = new DBConnect();
        Connection conn1 = db.getConnection(url, user, pass);
        String query = "select * from light ORDER BY id";
        Statement statement = conn1.createStatement();
        ResultSet result = statement.executeQuery(query);
        System.out.println("Тут выводим перелеты из базы данных ");

        ArrayList flights = new ArrayList<Flight>();
        while (result.next()) {
            Integer number = result.getInt("number");
            Timestamp timeFlight = result.getTimestamp("timeFlight");
            Integer id = result.getInt("id");

            Flight flight = new Flight(id, number, timeFlight);
            flights.add(flight);

            System.out.println(flight);
        }
        conn1.close();
        statement.close();
        result.close();


        String str = new String(flights.toString());
        System.out.println("\nВыводим тоже самое массивом из ArrayList");
        for (String ret : str.split(",")) {
            System.out.println(ret);
        }

        /*Connect c = new Connect();
        Statement stm = c.getConnection().createStatement();
        String sql =  "CREATE TABLE MY_TABLE "+
                "(ID INT NOT NULL,"
                + "NAME TEXT       NOT NULL,"
                + "AGE             INT                  NOT NULL)";

            stm.executeUpdate(sql);
            stm.close();*/

        Flight flight2 = new Flight();
        flight2.setNumber(756789);
        flight2.setTimeFlight("01.03.2010 17:30");
        flight2.setTimeArrival("01.03.2010 18:00");
        flight2.setCityOut("Ulyanovsk");
        flight2.setCityIn("Sevastopol");

        flight2.printText();

        DBConnect dbConnect = new DBConnect();
        Connection conn2 = dbConnect.getConnection(url, user, pass);
        String zapros = "select * from airoportss ORDER BY name";
        Statement statement2 = conn2.createStatement();
        ResultSet resultSet = statement2.executeQuery(zapros);
        while (resultSet.next()) {

            int idd = resultSet.getInt("idd");
            String iata = resultSet.getString("iata");
            String adress = resultSet.getString("adress");
            String name = resultSet.getString("name");
            System.out.println(idd+ " " + iata +"|\t "+ name +"|  " + adress+"|\t " );
        }
        conn2.close();
        statement2.close();
        resultSet.close();

        Aircraft boing = new Aircraft();
        boing.setName1("Boing-747");
        boing.setCapacity(234);
        boing.setMaxspeed(1000);
        boing.infoWindow();

        Aircraft aircraft = new Aircraft("text.txt");
        for (String craft : aircraft.getAircraft()) {
            System.out.println(craft);
        }


        System.out.println("\nНиже введите номер строки от 1 до 4 "); //выводим строку  методом printStr
        aircraft.printStr();

    }
}

