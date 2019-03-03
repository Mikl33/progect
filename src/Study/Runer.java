package Study;
import java.text.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Runer {
    public static void main(String[]args){

        Flight flight = new Flight();
        flight.number = 123;
        flight.cityOut = "Ulyanovsk";
        flight.cityIn = "Sevastopol";

        flight.printText();

        Aircraft boing = new Aircraft("boing-735", 500, 1200);
        boing.infoWindow();

        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy HH:mm");
        String strFlightDate = "03.03.2010 17:30";

        //flight.flightDate = new Date();
        //flight.flightDate = ft.parse(strFlightDate);

        try {
            flight.flightDate = ft.parse(strFlightDate);
            System.out.println(flight.flightDate);
        } catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }



    }
 }
