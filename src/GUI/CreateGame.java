package GUI;

import SDK.User;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Image;
import javax.swing.*;

public class CreateGame extends JPanel {
    private JTextField txtGameName;
    private JTextField textFieldMovements;
    private JLabel lblCreategame;
    private JLabel lblEnterGameName;
    private JLabel lblPleaseChooseAn;
    private JLabel lblPleaseEnterSnake;
    private JLabel lblwasd;
    private JButton btnCreateGame;
    private JButton btnBack;
    private JComboBox comboBox;


    /**
     * Create the panel.
     */

    public CreateGame() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblCreategame = new JLabel("Create Game");
        lblCreategame.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblCreategame.setBounds(120, 55, 310, 46);
        add(lblCreategame);

        lblEnterGameName = new JLabel("Please enter a game ID:");
        lblEnterGameName.setFont(new Font("Impact", Font.PLAIN, 13));
        lblEnterGameName.setBounds(77, 122, 128, 16);
        add(lblEnterGameName);

        txtGameName = new JTextField();
        txtGameName.setBounds(48, 150, 192, 22);
        add(txtGameName);
        txtGameName.setColumns(10);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setFont(new Font("Impact", Font.PLAIN, 13));
        btnCreateGame.setBounds(297, 309, 192, 38);
        add(btnCreateGame);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(48, 309, 192, 38);
        add(btnBack);

        comboBox = new JComboBox();
        comboBox.setBounds(297, 143, 192, 38);
        add(comboBox);

        lblPleaseChooseAn = new JLabel("Please choose an opponent:");
        lblPleaseChooseAn.setFont(new Font("Impact", Font.PLAIN, 13));
        lblPleaseChooseAn.setBounds(317, 124, 159, 16);
        add(lblPleaseChooseAn);

        lblPleaseEnterSnake = new JLabel("Please enter snake movements:");
        lblPleaseEnterSnake.setFont(new Font("Impact", Font.PLAIN, 13));
        lblPleaseEnterSnake.setBounds(58, 184, 174, 16);
        add(lblPleaseEnterSnake);

        textFieldMovements = new JTextField();
        textFieldMovements.setBounds(48, 212, 192, 85);
        add(textFieldMovements);
        textFieldMovements.setColumns(10);

        lblwasd = new JLabel("");
        Image src = new ImageIcon(this.getClass().getResource("wasd.png")).getImage();
        lblwasd.setIcon(new ImageIcon(src));
        lblwasd.setBounds(322, 105, 300, 300);
        add(lblwasd);

    }

    public void actionPerformedCreateGame(ActionListener l) {
        btnCreateGame.addActionListener(l);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }

    public void setUsers(ArrayList<User> users) {
        comboBox.removeAllItems();
        for (User opponent : users) {
            comboBox.addItem(opponent.getUsername());
        }
    }

    public String getTxtGameName() {
        return txtGameName.getText();
    }

    public String getUsernameFromCombo() {
        return (String) comboBox.getSelectedItem();
    }

    public String getTextFieldMovements() {
        return textFieldMovements.getText();
    }
}



