package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class CreateGame extends JPanel {
        private JTextField txtGameName;
        private JLabel lblCreategame;
        private JLabel lblEnterGameName;
        private JButton btnCreateGame;
        private JButton btnBack;

    /**
     * Create the panel.
     */

/**
 * Created by AliRashid on 26/11/15.
 */
    public class CreateGame {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblCreategame = new JLabel("Create Game");
        lblCreategame.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblCreategame.setBounds(120, 55, 310, 46);
        add(lblCreategame);

        lblEnterGameName = new JLabel("Please enter a game ID:");
        lblEnterGameName.setFont(new Font("Impact", Font.PLAIN, 13));
        lblEnterGameName.setBounds(211, 113, 128, 16);
        add(lblEnterGameName);

        txtGameName = new JTextField();
        txtGameName.setBounds(179, 141, 192, 38);
        add(txtGameName);
        txtGameName.setColumns(10);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setFont(new Font("Impact", Font.PLAIN, 13));
        btnCreateGame.setBounds(179, 191, 192, 38);
        add(btnCreateGame);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(179, 229, 192, 38);
        add(btnBack);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
    });
        btnCreateGame.setFont(new Font("Impact", Font.PLAIN, 13));
        btnCreateGame.setBounds(166, 191, 117, 29);
    }
}
