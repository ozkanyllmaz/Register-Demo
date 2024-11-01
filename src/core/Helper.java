package core;

import javax.swing.*;

public class Helper {
    public static void setTheme(){
        for(UIManager.LookAndFeelInfo theme: UIManager.getInstalledLookAndFeels()){
            if(theme.getName().equals("Nimbus")){
                try {
                    UIManager.setLookAndFeel(theme.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    public static void optionPaneDialogTr(){
        UIManager.put("OptionPane.okButtonText","Tamam");
    }

    public static void showMsg(String str){
        String msg;
        String title;

        optionPaneDialogTr();
        switch (str){
            case "fill":
                title = "Hata!";
                msg = "Lütfen tüm alanları doldurunuz!";
                break;
            case "invalid":
                title = "Geçersiz!";
                msg = "Lütfen geçerli bir e-posta adresi giriniz";
                break;
            case "done":
                title = "Başarılı!";
                msg = "Başarılı bir şekilde kaydedildi!";
                break;
            case "error":
                title = "Başarısız!";
                msg = "Hata oluştu";
            default:
                title = "Mesaj";
                msg = str;
                break;
        }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);

    }
    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static boolean isFieldListEmpty(JTextField[] fields){
        for(JTextField field : fields){
            if(isFieldEmpty(field)){
                return true;
            }
        }
        return false;
    }
}
