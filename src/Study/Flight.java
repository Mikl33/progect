package Study;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flight {
    public Date flightDate;
    private Airport cityOut;
    Airport cityIn;
    private Integer number;
    private Date timeFlight;
    private Date timeArrival;

    //private  Aircraft aircraft;
    //public Flight(Integer number){
    //    this.number = number;
    //}

    public Date getTimeFlight(){
        return timeFlight;
    }

    public void setTimeFlight(String strTimeFlight){
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy HH:mm");
        try {
            this.timeFlight = ft.parse(strTimeFlight);
        } catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
    }

    public Date getTimeArrival(){
        return timeArrival;
    }

    public void setTimeArrival(Date timeArrival){
        this.timeArrival = timeArrival;
    }


    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer number1) {
        if (number1 < 0) {
            System.out.println("Какаето херня");
        } else {
            this.number = number1;
        }
    }



    void printText() {
        System.out.printf("\n Номер рейса %d \n Город вылета   %s \n Город прибытия %s \n  \n\n",number, cityOut, cityIn);
    }

}