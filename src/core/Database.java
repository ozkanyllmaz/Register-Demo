package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance = null;
    private final String DB_URL = "jdbc:postgresql://localhost:5432/RegisterDemo";
    private final String DB_USER = "postgres";
    private final String DB_PASSWORD = "12345";
    private Connection connection = null;

    public Connection getConnection(){
        return connection;
    }

    public static Connection getInstance(){
        try {
            if(instance == null || instance.connection.isClosed()){
                instance = new Database();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return instance.getConnection();
    }

    private Database() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
