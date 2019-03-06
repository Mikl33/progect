package Study;
import java.text.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Runer {
    public static void main(String[]args){



        Flight flight = new Flight();
        flight.setNumber(756789);
        System.out.println(flight.getNumber());
        System.out.println("Номере рейса "+ flight.getNumber());
        flight.setTimeFlight("03.03.2010 17:30");
        System.out.println(flight.getTimeFlight());

        flight.cityOut = "Ulyanovsk";
        flight.cityIn = "Sevastopol";

       flight.printText();

        Aircraft boing = new Aircraft();
        boing.setName("Boing-747");
        System.out.println(boing.getName());
        boing.infoWindow();

       /*  SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy HH:mm");
        String strFlightDate = "03.03.2010 17:30";

        try {
            flight.flightDate = ft.parse(strFlightDate);
            System.out.println(flight.flightDate);
            System.out.println(boing);
        } catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);

        }

*/

    }
 }
