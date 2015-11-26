package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Created by AliRashid on 26/11/15.
 */
public class Screen extends JFrame {
    public static final String LOGIN = "Login";
    public static final String CREATEGAME = "CreateGame";
    public static final String DELETEGAME = "DeleteGame";
    public static final String LOADHIGHSCORE = "LoadHighScore";
    public static final String SHOWRESULTS = "ShowResults";
    public static final String JOINGAME = "JoinGame";
    public static final String GAMEMENU = "GameMenu";


    private JPanel contentPane;
    private CreateGame creategame;
    private DeleteGame deletegame;
    private LoadHighScore loadhighscore;
    private ShowResults showresults;
    private JoinGame joingame;
    private GameMenu gamemenu;
    private Login login;

    private CardLayout cardlayout;


    /**
     * Create the frame.
     */
    public Screen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        login = new Login();
        contentPane.add(login, LOGIN);

        creategame = new CreateGame();
        contentPane.add(creategame, CREATEGAME);

        deletegame = new DeleteGame();
        contentPane.add(deletegame, DELETEGAME);

        loadhighscore = new LoadHighScore();
        contentPane.add(loadhighscore, LOADHIGHSCORE);

        showresults = new ShowResults();
        contentPane.add(showresults, SHOWRESULTS);

        joingame = new JoinGame();
        contentPane.add(joingame, JOINGAME);

        gamemenu = new GameMenu();
        contentPane.add(gamemenu, GAMEMENU);

        cardlayout = (CardLayout) getContentPane().getLayout();
    }
}


