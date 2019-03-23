package Study;

import java.sql.*;

public class Runer {
    public static void main(String[]args){



        Flight flight = new Flight();
        flight.setNumber(756789);
        System.out.println("Номере рейса "+ flight.getNumber());
        flight.setTimeFlight("01.03.2010 17:30");
        System.out.println(flight.getTimeFlight());
        flight.setTimeArrival("01.03.2010 18:00");
        System.out.println(flight.getTimeArrival());
        flight.setCityOut("Ulyanovsk");
        flight.setCityIn ("Sevastopol");

       flight.printText();

        Aircraft boing = new Aircraft();
        boing.setName("Boing-747");
        boing.setCapacity(234);
        boing.setMaxspeed(1000);
        boing.infoWindow();




       Airport airports = new Airport("text.txt");
    //   System.out.println("Аэропорты: " + airports); // Выводим строку массивом?
       for (String airport  : airports.getPorts()) {
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
    Connection db =DriverManager.getConnection(url=,user,user);
    Class.forName("org.postgresql.Driver");



}
