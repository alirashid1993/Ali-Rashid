package SDK;

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

    public int getID(int ID) { this.ID = ID;
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

