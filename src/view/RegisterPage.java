package view;

import core.Helper;
import dao.RegisterDao;
import entity.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage extends JFrame {

    private JPanel container;
    private JTextField txtField_mail;
    private JPasswordField psswrd_password;
    private JButton btn_kayitOl;
    private JButton btn_girisYap;
    private JPanel pnl_baslik;
    private JPanel pnl_btns;
    private JPanel pnl_orta;
    private JLabel lbl_email;
    private JLabel lbl_sifre;
    private JButton btn_forgotPassword;
    private JPanel pnl_signUp;
    private RegisterDao registerDao;

    public RegisterPage() {
        this.registerDao = new RegisterDao();

        this.add(container);
        this.setTitle("Register");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        btn_kayitOl.addActionListener(e -> {
            SignUpPage signUpPage = new SignUpPage();
            dispose();
        });
        btn_girisYap.addActionListener(e -> {
            User user = registerDao.findByLogin(txtField_mail.getText(), psswrd_password.getText());
            JTextField[] checkList = {txtField_mail, psswrd_password};
            boolean result = Helper.isFieldListEmpty(checkList);
            if(result){
                Helper.showMsg("fill");
            } else {
                if(user == null){
                    Helper.showMsg("Böyle bir kullanıcı yok!");
                } else {
                    System.out.println(user.toString());
                    Helper.showMsg("Giriş yapıldı!");
                }
            }

        });
        btn_forgotPassword.addActionListener(e -> {
            ForgotPage forgotPage = new ForgotPage();
            dispose();
        });
    }

}
