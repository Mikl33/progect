package Study;

import java.util.Date;

public class Flight {

    private Integer number ;
    String cityOut;
     String cityIn;
    private Date timeFlight;
    private Date timeArrival;
   public Date flightDate;
    private  Aircraft aircraft;


  //  public Flight(Integer number){
    //    this.number = number;
    //}

    public Integer getNumber(){
        return number;
    }


    public void setNumber(Integer number) {
        if (number < 0) {
            System.out.println("Какаето херня");
        } else {
            this.number = number;
               }
    }
    class Airaport {
        private String airaportOut;
        private String airaportIn;}


    void printText() {
        System.out.printf("\n Номер рейса %d \n Город вылета   %s \n Город прибытия %s \n  \n\n",number, cityOut, cityIn);
    }

    }