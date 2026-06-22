package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/gym_management";

    private static final String USER = "root";

    private static final String PASSWORD = "#17Ygta83almsY268";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (Exception e) {

            System.out.println("Database Error: " + e.getMessage());

        }

        return null;
    }
}
