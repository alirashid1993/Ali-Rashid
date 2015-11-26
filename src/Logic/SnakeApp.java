package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Screen;


public class SnakeApp {

    private Screen screen;


    public SnakeApp() {
        screen = new Screen();
        screen.setVisible(true);
    }
    public void run() {

        screen.getLogin().actionPerformedLogin(
                new LoginActionListener());
        screen.getCreategame().actionPerformedCreateGame(
                new CreateGameActionListener());
        screen.getDeletegame().actionPerformedDeleteGame(
                new DeleteGameActionListener());
        screen.getGameMenu().addACList(
                new GameMenuActionListener());
        screen.getJoingame().actionPerformedJoinGame(
                new JoinGameActionListener());
        screen.getLoadhighscore().actionPerformedLoadHighScore(
                new LoadHighScoreActionListener());
        screen.getShowresults().actionPerformedShowResults(
                new ShowResultsActionListener());
        screen.show(Screen.LOGIN);

        screen.getCreategame().actionPerformedBack(
                new CreateGameActionListenerBack());
        screen.getDeletegame().actionPerformedBack(
                new DeleteGameActionListenerBack());
        screen.getJoingame().actionPerformedBack(
                new JoinGameActionListenerBack());
        screen.getLoadhighscore().actionPerformedBack(
                new LoadHighScoreGameActionListenerBack());
        screen.getShowresults().actionPerformedBack(
                new ShowResultsActionListenerBack());

    }

    private class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String actCom = e.getActionCommand();
            if (actCom.equals("Login")) {
                screen.show(Screen.GAMEMENU);
            }
        }
    }

    private class CreateGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String actCom = e.getActionCommand();
            if (actCom.equals("Create Game")){
                screen.show(Screen.CREATEGAME);
            }
        }
    }
    private class DeleteGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if(actCom.equals("Delete Game")){
                screen.show(Screen.DELETEGAME);
            }
        }
    }
    private class GameMenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String actCom = e.getActionCommand();
            if (actCom.equals("CREATE GAME")){
                screen.show(Screen.CREATEGAME);
            }else if (actCom.equals("DELETE GAME")){
                screen.show(Screen.DELETEGAME);
            }else if (actCom.equals("JOIN GAME")){
                screen.show(Screen.JOINGAME);
            }else if (actCom.equals("HIGHSCORES")){
                screen.show(Screen.LOADHIGHSCORE);
            }else if (actCom.equals("SHOW RESULTS")){
                screen.show(Screen.SHOWRESULTS);
            }else
                screen.show(Screen.LOGIN);
        }
    }
    public class JoinGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0){
            String actCom = arg0.getActionCommand();
            if(actCom.equals("Join Game")){
                screen.show(Screen.JOINGAME);
            }
        }
    }
    private class LoadHighScoreActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if(actCom.equals("Load Highscore")){
                screen.show(Screen.LOADHIGHSCORE);
            }
        }
    }
    private class ShowResultsActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if(actCom.equals("Show Results")){
                screen.show(Screen.SHOWRESULTS);
            }
        }
    }
    private class CreateGameActionListenerBack implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            screen.show(Screen.GAMEMENU);
        }
    }
    private class DeleteGameActionListenerBack implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            screen.show(Screen.GAMEMENU);
        }
    }
    private class JoinGameActionListenerBack implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            screen.show(Screen.GAMEMENU);
        }
    }
    private class LoadHighScoreGameActionListenerBack implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            screen.show(Screen.GAMEMENU);
        }
    }
    private class ShowResultsActionListenerBack implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            screen.show(Screen.GAMEMENU);
        }
    }

}

