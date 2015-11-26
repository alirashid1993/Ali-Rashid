package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShowResults extends JPanel {
    private JTextField txtResultID;
    private JLabel lblShowResults;
    private JLabel lblEnterGameID;
    private JButton btnShowResults;
    private JButton btnBack;
    /**
     * Create the panel.
     */
    public ShowResults() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblShowResults = new JLabel("Show Results");
        lblShowResults.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblShowResults.setBounds(58, 72, 334, 45);
        add(lblShowResults);

        lblEnterGameID = new JLabel("Enter game ID to view results for a specific game:");
        lblEnterGameID.setFont(new Font("Impact", Font.PLAIN, 13));
        lblEnterGameID.setBounds(89, 129, 271, 16);
        add(lblEnterGameID);

        txtResultID = new JTextField();
        txtResultID.setColumns(10);
        txtResultID.setBounds(130, 157, 192, 38);
        add(txtResultID);

        btnShowResults = new JButton("Show Game Result");
        btnShowResults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnShowResults.setFont(new Font("Impact", Font.PLAIN, 13));
        btnShowResults.setBounds(130, 199, 192, 38);
        add(btnShowResults);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(130, 239, 192, 38);
        add(btnBack);

    }
    public void actionPerformedShowResults(ActionListener l) {
        btnShowResults.addActionListener(l);
    }
    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
