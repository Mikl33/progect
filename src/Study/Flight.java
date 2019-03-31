package Study;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flight {
    private  String cityOut;
    private String cityIn;
    private Integer number;
    private Date timeFlight;
    private Date timeArrival;
    private  int id;

    public Flight() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public  Flight(Integer id, Integer number, Timestamp timeFlight){
        this.id = id;
        this.timeFlight = timeFlight;
        this.number = number;
    }
@Override
    public  String toString(){
        return  "Flight: [" + id + "\t" + number + "\t" + timeFlight +"]";
    }



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

    public void setTimeArrival(String strTimeArrival){
        SimpleDateFormat at = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        try {
            this.timeArrival = at.parse(strTimeArrival);
        } catch (ParseException e) {
            System.out.println("No PArsing" + at);
        }

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

    public String getCityOut() {
        return cityOut;
    }

    public void setCityOut(String cityOut) {
        this.cityOut = cityOut;
    }

    public void setCityIn(String cityIn) {
        this.cityIn = cityIn;
    }

    void printText() {
        System.out.println("\n Здесь параметры выведенные из Flight о рейсе");
        System.out.printf("\n Номер рейса %d \n Город вылета   %s \n Город прибытия %s \n Время вылета %s\n Время прилета %s \n\n\n",
                number, cityOut, cityIn, timeFlight.toString(), timeArrival.toString());
       }

}