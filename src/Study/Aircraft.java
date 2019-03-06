package Study;

public class Aircraft {

    private String name;
    private int capacity;
    private int maxspeed;

    /*public Aircraft(String name, int capacity, int maxspeed) {
        this.name = name;
        this.capacity = capacity;
        this.maxspeed = maxspeed;
    }
*/

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.equals(0)) {
            System.out.println("Имя не заданно");
        }else {
            this.name = name;
        }
    }


    void infoWindow() {
        System.out.printf("Здесь параметры самолета \n Name: %s model \nSpeed: %d км/ч \nCapacity: %d чел \n\n" , name, maxspeed,capacity );
    }
}