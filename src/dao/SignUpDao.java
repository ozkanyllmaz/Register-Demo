package dao;

import core.Database;
import entity.User;
import view.SignUpPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDao {
    private Connection connection;

    public SignUpDao(){
        this.connection = Database.getInstance();
    }

    public boolean saveUser(User user){
        String query = "INSERT INTO users (username_first, username_last, useremail, userpassword) VALUES (?,?,?,?)";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,user.getUsername_first());
            pstmt.setString(2,user.getUsername_last());
            pstmt.setString(3, user.getUseremail());
            pstmt.setString(4, user.getUserpassword());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
