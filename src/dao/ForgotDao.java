package dao;

import core.Database;
import entity.User;
import view.ForgotPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgotDao {
    private Connection connection;
    public ForgotDao(){
        this.connection = Database.getInstance();
    }

    public boolean updateUser(String mail, String password) {
        User user = null;
        String query = "UPDATE users SET userpassword = ? WHERE useremail = ?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,password);
            pstmt.setString(2,mail);
            return pstmt.executeUpdate() != -1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
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
