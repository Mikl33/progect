package Study;

public class Aircraft {

    public String name;
    public int capacity;
    public int maxspeed;

    public Aircraft(String name, int capacity, int maxspeed) {
        this.name = name;
        this.capacity = capacity;
        this.maxspeed = maxspeed;

    }

    void infoWindow() {
        System.out.printf("Name: %s model \nSpeed: %d км/ч \nCapacity: %d \n\n" , name, maxspeed,capacity );
    }
}