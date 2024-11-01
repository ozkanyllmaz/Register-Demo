import core.Database;
import core.Helper;
import view.RegisterPage;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection connection = Database.getInstance();
        Helper.setTheme();
        RegisterPage registerPage = new RegisterPage();
    }
}