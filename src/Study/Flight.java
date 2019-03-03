package Study;

import java.util.Date;

public class Flight {

         int number ;
         String cityOut;
         String cityIn;
         Date flightDate;
         Aircraft aircraft;



    void printText(){
        System.out.printf("Номер рейса %d \n Город вылета   %s \n Город прибытия %s \n  \n\n" ,number,cityOut,cityIn);
    }

}



