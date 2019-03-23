package Study;

public class Aircraft {

    private String name;
    private int capacity;
    private int maxspeed;



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
    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    void infoWindow() {
        System.out.printf("Здесь параметры самолета \n Name: %s model \nSpeed: %d км/ч \nCapacity: %d чел \n\n" , name, maxspeed,capacity );
    }
}