package Study;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Driver;
import org.postgresql.*;

public class Airport {
    private List<String> ports = new ArrayList<>();

    public Airport(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                ports.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("tt");
        } catch (IOException e) {
            System.out.println("fg");
        }
//
    }

        public Airport(List<String> ports) {
        this.ports = ports;
    }

    public List<String> getPorts() {
        return ports;
   }


      void printStr()  {
          String li;
          Integer n;

          Scanner scn =new Scanner(System.in);
          n = scn.nextInt();
          if (n>3 && n<1)
              System.out.println("неверный ввод");

          else
          {
              try {
                  li = Files.readAllLines(Paths.get("text.txt")).get(n-1);
                  System.out.println(li);
              } catch (IOException e) {
                  e.printStackTrace();
              }

          }
      }


    @Override
    public String toString() {
        return "Airport{" +
                "ports=" + ports +
                '}';
   }



      Class.forName("org.postgresql.Driver");
    Connection connection = DriverManager.getConnection("jdbc:postgresql://hostname:port/dbname","username", "password");
   connection.close();
}