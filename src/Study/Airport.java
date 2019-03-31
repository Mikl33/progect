package Study;

public class Airport {
     private Integer idd;
     private String name;
     private String adress;
     private String iata;


public  Airport(){

}
     public void setName(String name) {
          this.name = name;
     }

     public void setAdress(String adress) {
          this.adress = adress;
     }

     public void setIdd(Integer idd) {
          this.idd = idd;
     }

     public void setIata(String iata) {
          this.iata = iata;
     }

     public String getIata() {
          return iata;
     }

     public String getAdress() {
          return adress;
     }

     public String getName() {
          return name;
     }

     public Integer getIdd() {
          return idd;
     }
}
