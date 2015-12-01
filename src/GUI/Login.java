package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JPanel {
    private JTextField username;
    private JPasswordField password;
    private JButton btnLogin;
    private JLabel lblWelcome;
    private JLabel lblPlease;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblErrorMessage;



    /**
     * Create the panel.
     */
    public Login()
    {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        btnLogin = new JButton("Login");

        password = new JPasswordField();
        password.setBounds(231, 242, 153, 26);
        add(password);

        lblWelcome = new JLabel("to Snake");
        lblWelcome.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblWelcome.setBounds(168, 127, 218, 41);
        add(lblWelcome);

        lblPlease = new JLabel("Please enter Username and Password:");
        lblPlease.setFont(new Font("Impact", Font.PLAIN, 13));
        lblPlease.setBounds(170, 180, 218, 16);
        add(lblPlease);

        lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Impact", Font.PLAIN, 13));
        lblUsername.setBounds(168, 214, 71, 16);
        add(lblUsername);

        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Impact", Font.PLAIN, 13));
        lblPassword.setBounds(168, 246, 71, 16);
        add(lblPassword);

        username = new JTextField();
        username.setBounds(231, 208, 153, 28);
        add(username);
        username.setColumns(10);

        btnLogin.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnLogin.setFont(new Font("Impact", Font.PLAIN, 22));
        btnLogin.setBounds(166, 292, 218, 41);
        add(btnLogin);

        JLabel lblWelcome_1 = new JLabel("Login");
        lblWelcome_1.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblWelcome_1.setBounds(201, 73, 152, 45);
        add(lblWelcome_1);

        lblErrorMessage = new JLabel();
        lblErrorMessage.setForeground(Color.RED);
        lblErrorMessage.setFont(new Font("Impact", Font.BOLD, 13));
        lblErrorMessage.setBounds(170, 276, 247, 16);
        add(lblErrorMessage);

    }


    public JTextField getEnterusername() {
        return username;
    }

    public void setEnterusername(JTextField enterusername) {
        this.username = enterusername;
    }

    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }


    public JPasswordField getPassword() {
        return password;
    }


    public void setPassword(JPasswordField password) {
        this.password = password;
    }


    public void actionPerformedLogin(ActionListener l) {
        btnLogin.addActionListener(l);
    }
    public JLabel getErrorMessage() {
        return lblErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.lblErrorMessage.setText(errorMessage);
    }
}
