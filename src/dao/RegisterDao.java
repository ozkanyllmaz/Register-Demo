package dao;

import core.Database;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterDao {
    private Connection connection;
    public RegisterDao(){
        this.connection = Database.getInstance();
    }
    public User findByLogin(String mail, String password){
        User user = null;
        String query = "SELECT * FROM users WHERE useremail = ? AND userpassword = ?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,mail);
            pstmt.setString(2,password);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                user = this.match(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public User match(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUsername_first(rs.getString("username_first"));
        user.setUsername_last(rs.getString("username_last"));
        user.setUseremail(rs.getString("useremail"));
        user.setUserpassword(rs.getString("userpassword"));
        return user;
    }
}
