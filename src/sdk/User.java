package SDK;

import java.util.ArrayList;

public class User {


    //
    //
    private String username;
    private String password;
    private int ID;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void getUsername(String username) {
        this.username = username;
    }

    public void getPassword(String password) {
        this.password = password;
    }

    public void setID(int ID){
        this.ID = ID;
    }
}
