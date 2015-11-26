package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameMenu extends JPanel {
    private JLabel lblUsermenu;
    private JButton btnCreate;
    private JButton btnJoin;
    private JButton btnDelete;
    private JButton btnLogOut;
    private JButton btnShowHighscores;


    /**
     * Create the panel.
     */
    public GameMenu() {
        setLayout(null);
        setBounds(100, 100, 550, 400);

        lblUsermenu = new JLabel("Menu");
        lblUsermenu.setFont(new Font("Phosphate", Font.PLAIN, 52));
        lblUsermenu.setBounds(209, 46, 131, 38);
        add(lblUsermenu);

        btnCreate = new JButton("CREATE GAME");
        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnCreate.setFont(new Font("Impact", Font.PLAIN, 13));
        btnCreate.setBounds(158, 96, 233, 38);
        add(btnCreate);

        btnJoin = new JButton("JOIN GAME");
        btnJoin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnJoin.setFont(new Font("Impact", Font.PLAIN, 13));
        btnJoin.setBounds(158, 133, 233, 38);
        add(btnJoin);

        btnDelete = new JButton("DELETE GAME");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnDelete.setFont(new Font("Impact", Font.PLAIN, 13));
        btnDelete.setBounds(158, 171, 233, 38);
        add(btnDelete);

        btnLogOut = new JButton("LOG OUT");
        btnLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnLogOut.setFont(new Font("Impact", Font.PLAIN, 13));
        btnLogOut.setBounds(158, 282, 233, 38);
        add(btnLogOut);

        btnShowHighscores = new JButton("HIGHSCORES");
        btnShowHighscores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnShowHighscores.setFont(new Font("Impact", Font.PLAIN, 13));
        btnShowHighscores.setBounds(158, 210, 233, 38);
        add(btnShowHighscores);

    }

    public void addACList(ActionListener ac){
        btnCreate.addActionListener(ac);
        btnDelete.addActionListener(ac);
        btnJoin.addActionListener(ac);
        btnLogOut.addActionListener(ac);
        btnShowHighscores.addActionListener(ac);
    }

    public void actionPerformed(ActionEvent e) {

    }
}

