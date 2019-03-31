package Study;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aircraft {

    private String name1;
    private int capacity;
    private int maxspeed;

    private List<String> aircraft = new ArrayList<>();

    public List<String> getAircraft() {
        return aircraft;
    }

    public Aircraft(String fibered) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fibered));
            String lin;
            while ((lin = bufferedReader.readLine())!=null) {
                aircraft.add(lin);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }


    void printStr()  {
        String li;
        Integer n;

        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        if (n > 4 || n < 1) {
            System.out.println("неверный ввод");
        } else {
            try {
                li = Files.readAllLines(Paths.get("text.txt")).get(n-1);
                System.out.println(li);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Aircraft() {
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        if (name1.equals(0)) {
            System.out.println("Имя не заданно");
        }else {
            this.name1 = name1;
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
        System.out.printf("\nЗдесь параметры самолета \n Name: %s model \nSpeed: %d км/ч \nCapacity: %d чел \n\n", name1, maxspeed, capacity);
    }
}