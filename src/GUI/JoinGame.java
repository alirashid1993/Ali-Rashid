package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinGame extends JPanel {
    private JTextField txtJoinID;
    private JLabel lblStartGame;
    private JLabel lblJoinGameID;
    private JButton btnStart;
    private JButton btnBack;

    /**
     * Create the panel.
     */
    public JoinGame() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblStartGame = new JLabel("Start Game");
        lblStartGame.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblStartGame.setBounds(136, 116, 277, 45);
        add(lblStartGame);

        lblJoinGameID = new JLabel("Please enter the an ID of a game you want to join:");
        lblJoinGameID.setFont(new Font("Impact", Font.PLAIN, 13));
        lblJoinGameID.setBounds(142, 173, 265, 16);
        add(lblJoinGameID);

        txtJoinID = new JTextField();
        txtJoinID.setColumns(10);
        txtJoinID.setBounds(179, 201, 192, 38);
        add(txtJoinID);

        btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnStart.setFont(new Font("Impact", Font.PLAIN, 13));
        btnStart.setBounds(179, 242, 192, 38);
        add(btnStart);

        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(179, 283, 192, 37);
        add(btnBack);

    }
    public void actionPerformedJoinGame(ActionListener JoinGame){
        btnStart.addActionListener(JoinGame);
    }
    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
