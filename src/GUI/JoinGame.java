package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class JoinGame extends JPanel {
    private JLabel lblStartGame;
    private JLabel lblJoinGameID;
    private JLabel lblEnterSnakeMovements;
    private JButton btnStart;
    private JButton btnBack;
    private JTextField textFieldOppMovements;
    private JComboBox comboBoxPending;

    /**
     * Create the panel.
     */
    public JoinGame() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblStartGame = new JLabel("Join Game");
        lblStartGame.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblStartGame.setBounds(150, 84, 249, 45);
        add(lblStartGame);

        lblJoinGameID = new JLabel("Please choose one of your pending games:");
        lblJoinGameID.setFont(new Font("Impact", Font.PLAIN, 13));
        lblJoinGameID.setBounds(32, 159, 242, 16);
        add(lblJoinGameID);

        btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnStart.setFont(new Font("Impact", Font.PLAIN, 13));
        btnStart.setBounds(179, 269, 192, 38);
        add(btnStart);

        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(179, 319, 192, 37);
        add(btnBack);

        comboBoxPending = new JComboBox();
        comboBoxPending.setBounds(32, 159, 242, 81);
        add(comboBoxPending);

        textFieldOppMovements = new JTextField();
        textFieldOppMovements.setColumns(10);
        textFieldOppMovements.setBounds(326, 186, 192, 45);
        add(textFieldOppMovements);

        lblEnterSnakeMovements = new JLabel("Enter snake here:\n");
        lblEnterSnakeMovements.setFont(new Font("Impact", Font.PLAIN, 13));
        lblEnterSnakeMovements.setBounds(379, 159, 96, 16);
        add(lblEnterSnakeMovements);

    }
    public void actionPerformedJoinGame(ActionListener JoinGame){
        btnStart.addActionListener(JoinGame);
    }
    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
