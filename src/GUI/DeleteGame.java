package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteGame extends JPanel {
    private JTextField txtDeleteID;
    private JLabel lblDeleteGame;
    private JLabel lblEnterDeleteID;
    private JButton btnDeleteGame;
    private JButton btnBack;


    /**
     * Create the panel.
     */
    public DeleteGame() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblDeleteGame = new JLabel("Delete Game");
        lblDeleteGame.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblDeleteGame.setBounds(127, 80, 295, 45);
        add(lblDeleteGame);

        lblEnterDeleteID = new JLabel("Please enter the ID of a game you want to delete:");
        lblEnterDeleteID.setFont(new Font("Impact", Font.PLAIN, 13));
        lblEnterDeleteID.setBounds(143, 137, 263, 16);
        add(lblEnterDeleteID);

        txtDeleteID = new JTextField();
        txtDeleteID.setColumns(10);
        txtDeleteID.setBounds(179, 165, 192, 38);
        add(txtDeleteID);

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            }
        });
        btnDeleteGame.setFont(new Font("Impact", Font.PLAIN, 13));
        btnDeleteGame.setBounds(179, 215, 192, 38);
        add(btnDeleteGame);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(179, 254, 192, 38);
        add(btnBack);

    }
    public JButton getBtnDeleteGame() {
        return btnDeleteGame;
    }

    public void actionPerformedDeleteGame(ActionListener DeleteGame){
        btnDeleteGame.addActionListener(DeleteGame);
    }
    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }

}
