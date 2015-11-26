package ui;

import javax.swing.*;
import java.awt.*;


public class LoginPanel extends JFrame {

    private JLabel errorMessage;
    private JButton TestForgotPass;
    private JButton TestLogin;
    private JPasswordField textFieldPassword;
    private JTextField textFieldUsername;
    private JLabel lblNewLabel;
    private JLabel lblNewLabelPassword;
    private JComponent lblNewLabelUserName;
    private JLabel TestLabel;

    public LoginPanel() {
        setLayout(null);
        setSize(MyFrame.SIZE);
        setBackground(Theme.BACKGROUNDCOLOR);

        TestLabel = new JLabel();
        TestLabel.setBounds(189, 116, 298, 50);
        add(TestLabel);

        lblNewLabelUserName = new JLabel("Username:");
        lblNewLabelUserName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabelUserName.setBounds(207, 201, 102, 34);
        add(lblNewLabelUserName);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(316, 204, 179, 34);
        add(textFieldUsername);

        lblNewLabelPassword = new JLabel("Password:");
        lblNewLabelPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabelPassword.setBounds(207, 258, 95, 34);
        add(lblNewLabelPassword);

        textFieldPassword = new JPasswordField();
        textFieldPassword.setBounds(316, 261, 179, 34);
        add(textFieldPassword);

        TestLogin = new JButton("Login");
        TestLogin.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        TestLogin.setActionCommand("DoLogin");
        TestLogin.setBounds(215, 338, 262, 41);
        add(TestLogin);

        lblNewLabel = new JLabel();
        lblNewLabel.setBounds(497, 465, 179, 50);
        add(lblNewLabel);

        errorMessage = new JLabel();
        errorMessage.setForeground(new Color(190, 255, 60));
        errorMessage.setFont(new Font("Lucida Grande", Font.ITALIC, 14));
        errorMessage.setBounds(215, 304, 298, 22);
        add(errorMessage);

        TestForgotPass = new JButton("Forgot password?");
        TestForgotPass.setBounds(211, 391, 270, 28);
        TestForgotPass.setActionCommand("OpenForgotCheckUser");
        add(TestForgotPass);
    }
}

 /*   public String getTextFieldUserName()
    {
        return textFieldUsername.getText();
    }
    public String getTextFieldPassword()
    {
        String password = new String(textFieldPassword.getPassword());
        return password;
    }*/

 /*   public void setClearUserName()
    {
        textFieldUsername.setText("");
    }
    public void setClearPassword()
    {
        textFieldPassword.setText("");
    }
    public void setError(String errorMessage)
    {
        this.errorMessage.setText(errorMessage);
    }*/

/*    public void addActionListener(ActionListener ac)
    {
        TestLogin.addActionListener(ac);
        TestForgotPass.addActionListener(ac);
    }*/
