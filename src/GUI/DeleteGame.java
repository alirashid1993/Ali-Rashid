package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class DeleteGame extends JPanel {
    private JTextField txtDeleteID;
    private JLabel lblDeleteGame;
    private JLabel lblEnterDeleteID;
    private JButton btnDeleteGame;
    private JButton btnBack;
    private JComboBox comboDelete;


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

        lblEnterDeleteID = new JLabel("Please choose a game u want to delete:");
        lblEnterDeleteID.setFont(new Font("Impact", Font.PLAIN, 13));
        lblEnterDeleteID.setBounds(165, 137, 219, 16);
        add(lblEnterDeleteID);

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

        comboDelete = new JComboBox();
        comboDelete.setBounds(179, 176, 192, 27);
        add(comboDelete);

    }
    public JButton getBtnDeleteGame() {
        return btnDeleteGame;
    }

    public JComboBox getComboDelete() {
        return comboDelete;
    }

    public void deleteFromCombo(){
        comboDelete.removeItemAt(comboDelete.getSelectedIndex());
    }

    public void actionPerformedDeleteGame(ActionListener DeleteGame){
        btnDeleteGame.addActionListener(DeleteGame);
    }
    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }

}
