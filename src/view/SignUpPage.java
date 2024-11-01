package view;

import core.Helper;
import dao.SignUpDao;
import entity.User;

import javax.swing.*;

public class SignUpPage extends JFrame{
    private JPanel panel1;
    private JPanel container;
    private JButton btn_backToLogIn;
    private JTextField txtField_mail;
    private JPanel pnl_baslik;
    private JPanel pnl_backtoLogin;
    private JPanel pnl_orta;
    private JPasswordField psword_psword;
    private JTextField txtField_firstName;
    private JTextField txtField_lastName;
    private JButton btn_signUp;
    private JPanel pnl_button;
    private JTextField txtField_password;
    private SignUpDao signUpDao;

    public SignUpPage(){

        this.signUpDao = new SignUpDao();

        this.add(container);
        this.setTitle("Sign Up");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        btn_backToLogIn.addActionListener(e -> {
            RegisterPage registerPage = new RegisterPage();
            dispose();
        });
        btn_signUp.addActionListener(e -> {
            String mail = this.txtField_mail.getText();
            String password = this.txtField_password.getText();
            String firstName = this.txtField_firstName.getText();
            String lastName = this.txtField_lastName.getText();

            User user = new User(firstName, lastName, mail, password);

            boolean result = this.signUpDao.saveUser(user);
            if(result){
                Helper.showMsg("done");
            } else {
                Helper.showMsg("fill");
            }


        });


    }
}
