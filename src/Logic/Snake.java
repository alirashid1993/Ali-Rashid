package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import GUI.Screen;
import SDK.API;
import SDK.Game;
import SDK.Gamer;
import SDK.User;

import javax.swing.*;

public class Snake {

    private Screen screen;
    private User currentUser;
    private API api;
    private ArrayList<User>users;

    public Snake() {
        screen = new Screen();
        screen.setVisible(true);

        currentUser = new User();
        api = new API();

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
        // Trim for at vaere sikker paa at der ikke er tomme spaces
        text = text.trim();

        if (text.equals("") || text.length() < 1 || text == null) {
            return true;
        } else {
            return false;
        }

    }

    private class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            currentUser.setUsername(screen.getLogin().getUsername().getText());
            currentUser.setPassword(screen.getLogin().getPassword().getText());


            String jLogin = null;

            jLogin = api.login(currentUser);
            users = api.getUsers();

            for (User usr : users){

                if (usr.getUsername().equals(currentUser.getUsername())){

                    System.out.println(usr.getId());
                    currentUser = usr;
                }
            }
                screen.getCreategame().setUsers(users);
                screen.show(screen.GAMEMENU);

        }
    }
        private class CreateGameActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String actCom = e.getActionCommand();
                if (actCom.equals("Create Game")) {
                    Game newGame = new Game();
                    newGame.setMapSize(750);
                    Gamer host = new Gamer();
                    Gamer opponent = new Gamer();

                    host.setId(currentUser.getId());
                    newGame.setName(screen.getCreategame().getTxtGameName());

                    for (User user : api.getUsers()) {

                        System.out.println(user.getId());
                        if (user.getUsername().equals(screen.getCreategame().getUsernameFromCombo()));
                            opponent.setId(user.getId());
                            System.out.println(user.getId());
                    }
                    host.setControls(screen.getCreategame().getTextFieldMovements());
                    newGame.setHost(host);
                    newGame.setOpponent(opponent);
                    String jCreate = api.jCreate(newGame);
                    JOptionPane.showMessageDialog(screen, jCreate);

                }
            }
        }

        private class DeleteGameActionListener implements ActionListener {
            public void actionPerformed(ActionEvent arg0) {
                String actCom = arg0.getActionCommand();
                if (actCom.equals("Delete Game")) {
                    screen.show(Screen.DELETEGAME);
                }
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

        public class JoinGameActionListener implements ActionListener {
            public void actionPerformed(ActionEvent arg0) {
                String actCom = arg0.getActionCommand();
                if (actCom.equals("Join Game")) {
                    screen.show(Screen.JOINGAME);
                }
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


