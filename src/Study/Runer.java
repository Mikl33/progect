package Study;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.postgresql.*;

public class Runer {
    public static void main(String[]args) throws SQLException {

        Connect connect = new Connect();

        String query = "select * from cust";
        Statement statement = connect.getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);
        while (result.next()){
                //result.getInt(1);
              System.out.println(result.getInt("id"));
                System.out.printf(result.getString(2)+" " + result.getString(5));
        }



            //Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "user");


            //PreparedStatement stmt = connection.prepareStatement("select * from ");
            //ResultSet Rs = stmt.executeQuery();
            //  while (Rs.next()) {
            //      System.out.println(Rs.findColumn(String.valueOf(1)));
            //  }
            // connection.close();

            Flight flight = new Flight();
            flight.setNumber(756789);
            System.out.println("Номере рейса " + flight.getNumber());
            flight.setTimeFlight("01.03.2010 17:30");
            System.out.println(flight.getTimeFlight());
            flight.setTimeArrival("01.03.2010 18:00");
            System.out.println(flight.getTimeArrival());
            flight.setCityOut("Ulyanovsk");
            flight.setCityIn("Sevastopol");

            flight.printText();

            Aircraft boing = new Aircraft();
            boing.setName("Boing-747");
            boing.setCapacity(234);
            boing.setMaxspeed(1000);
            boing.infoWindow();


            Airport airports = new Airport("text.txt");
            //   System.out.println("Аэропорты: " + airports); // Выводим строку массивом?
            for (String airport : airports.getPorts()) {
                System.out.println(airport);
            }
            System.out.println("Ниже введите номер строки от 0 до 2 "); //выводим строку  методом printStr
            airports.printStr();
            //   System.out.println("\nВывод заданной строки  " + airports.li);


//       airports = new Airport("text2.txt");
//
//       System.out.println("Аэропорты: ");
//        for (String airport  : airports.getPorts()) {
//            System.out.println(airport);
//        }




    }
    }

