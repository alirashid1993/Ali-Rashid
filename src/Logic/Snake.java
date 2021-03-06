package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import GUI.Screen;
import SDK.*;

import javax.swing.*;

public class Snake {

    private Screen screen;
    private User currentUser;
    private API api;
    private ArrayList<User> users;
    private ArrayList<Game> pendingGames;
    private ArrayList<Game> deleteGame;
    private Game newGame;



    public Snake() {
        screen = new Screen();
        screen.setVisible(true);

        currentUser = new User();
        api = new API();
        newGame = new Game();

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


        //back knapper
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

    private boolean isEmpty(String text) {
        //Metode der tjekker tomme spaces i den tilhørende panel
        text = text.trim();

        if (text.equals("") || text.length() < 1 || text == null) {
            return true;
        } else {
            return false;
        }


    }

    private class GameMenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String actCom = e.getActionCommand();
            if (actCom.equals("CREATE GAME")) {
                screen.show(Screen.CREATEGAME);
            } else if (actCom.equals("DELETE GAME")) {
                screen.show(Screen.DELETEGAME);
            } else if (actCom.equals("JOIN GAME")) {
                screen.show(Screen.JOINGAME);
            } else if (actCom.equals("HIGHSCORES")) {
                screen.show(Screen.LOADHIGHSCORE);
            } else if (actCom.equals("SHOW RESULTS")) {
                screen.show(Screen.SHOWRESULTS);
            } else
                screen.show(Screen.LOGIN);
        }
    }


    private class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actCom = e.getActionCommand();
            if (actCom.equals("Login")) {


                currentUser.setUsername(screen.getLogin().getUsername().getText());
                currentUser.setPassword(screen.getLogin().getPassword().getText());

                String jLogin = null;
                users = api.getUsers();

                for (User user : users) {
                    if (user.getUsername().equals(currentUser.getUsername())) {
                        System.out.println(user.getId());
                        currentUser = user;
                    }
                }
                String message = api.login(currentUser);
                JOptionPane.showMessageDialog(screen, message);
                if (message.equals("Login Succesful")) {
                    screen.getCreategame().setUsers(api.getUsers());
                    screen.show(screen.GAMEMENU);
                }
            }
        }
    }



    private class CreateGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actCom = e.getActionCommand();
            if (actCom.equals("Create Game")) {

                Gamer host = new Gamer();
                Gamer opponent = new Gamer();

                newGame.setMapSize(750);
                newGame.setHost(host);
                newGame.setOpponent(opponent);

                host.setId(currentUser.getId());
                newGame.setName(screen.getCreategame().getTxtGameName());

                for (User user : api.getUsers()) {

                    if (user.getUsername().equals(screen.getCreategame().getUsernameFromCombo())) ;
                    opponent.setId(user.getId());
                    System.out.println(user.getId());
                    newGame.setGameId(newGame.getGameId());
                }
                host.setControls(screen.getCreategame().getTextFieldMovements());
                //ERRORHANDLING fra tidligere problem, hvor host og opponet ikke kunne sættes

                String message = api.createGame(newGame);
                JOptionPane.showMessageDialog(screen, message);
                screen.show(screen.GAMEMENU);
            }
        }
    }

    private class DeleteGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if (actCom.equals("Delete Game")) {
                screen.show(Screen.DELETEGAME);
            }
            else if (actCom.equals(screen.getDeletegame().getBtnDeleteGame())) {
                Game game = new Game();
                for (Game delete: deleteGame){
                    if(delete.getName().equals(screen.getDeletegame().getComboDelete())){
                        game = delete;
                    }
                }
                String message = api.deleteGame(game.getGameId());
                JOptionPane.showMessageDialog(screen,message);
                if(message.equals("A game has been deleted")){
                    screen.getDeletegame().deleteFromCombo();
                }
            }
        }
    }


    public class JoinGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if (actCom.equals("Join Game")) {
                String controls = screen.getCreategame().getTextFieldMovements();
                Gamer opponent = new Gamer();
                opponent.setId(currentUser.getId());
                opponent.setControls(controls);

                newGame.setOpponent(opponent);

                for (Game game : pendingGames) {
                    if (screen.getJoingame().getComboChallenge().equals(game.getName()));
                    //
                }

            }
            newGame.getOpponent().setControls(screen.getJoingame().getTextFieldMovements());



        }
    }



    private class LoadHighScoreActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if (actCom.equals("Load Highscore")) {
                screen.show(Screen.LOADHIGHSCORE);
            }
        }
    }

    private class ShowResultsActionListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String actCom = arg0.getActionCommand();
            if (actCom.equals("Show Results")) {
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



