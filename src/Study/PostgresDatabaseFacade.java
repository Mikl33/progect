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

public class PostgresDatabaseFacade {

    private String className = "org.postgresql.Driver";
    private  String url = "jdbc:postgresql://localhost:5432/javase";
    private Connection connection = null;

}