package view;

import core.Helper;
import dao.ForgotDao;
import entity.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPage extends JFrame{
    private JPanel panel1;
    private JPanel container;
    private JTextField txtField_mail;
    private JTextField txtField_password;
    private JButton btn_resetPassword;
    private JButton btn_backToLogin;
    private JPanel pnl_alt;
    private JPanel pnl_orta;
    private JPanel pnl_baslik;
    private ForgotDao forgotDao;

    public ForgotPage(){
        this.forgotDao = new ForgotDao();

        this.add(container);
        this.setTitle("Reset Password");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        btn_backToLogin.addActionListener(e -> {
            RegisterPage registerPage = new RegisterPage();
            dispose();
        });
        btn_resetPassword.addActionListener(e -> {
            boolean userUpdate = forgotDao.updateUser(this.txtField_mail.getText(),this.txtField_password.getText());
            JTextField[] checkList = {txtField_mail,txtField_password};
            boolean result = Helper.isFieldListEmpty(checkList);
            if(result){
                Helper.showMsg("fill");
            } else {
                if(!userUpdate){
                    Helper.showMsg("Kullanıcı güncellenemedi");
                } else {
                    Helper.showMsg("Kullanıcı başarılı bir şekilde güncellendi!");
                }
            }
        });
    }
}
