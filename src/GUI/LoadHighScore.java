package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoadHighScore extends JPanel {
    private JTextField txtHighScores;
    private JLabel lblLoadHighscore;
    private	JButton btnLoadHighScore;
    private JButton btnBack;

    /**
     * Create the panel.
     */
    public LoadHighScore() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblLoadHighscore = new JLabel("Highscores");
        lblLoadHighscore.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblLoadHighscore.setBounds(132, 66, 285, 43);
        add(lblLoadHighscore);

        txtHighScores = new JTextField();
        txtHighScores.setColumns(10);
        txtHighScores.setBounds(70, 116, 409, 151);
        add(txtHighScores);

        btnLoadHighScore = new JButton("Load Highscores");
        btnLoadHighScore.setFont(new Font("Impact", Font.PLAIN, 13));
        btnLoadHighScore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnLoadHighScore.setBounds(184, 271, 182, 37);
        add(btnLoadHighScore);

        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnBack.setFont(new Font("Impact", Font.PLAIN, 13));
        btnBack.setBounds(184, 306, 182, 37);
        add(btnBack);
    }
    public void actionPerformedLoadHighScore(ActionListener l) {
        btnLoadHighScore.addActionListener(l);
    }
    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}