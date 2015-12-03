package SDK;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oracle.javafx.jmx.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;


/**
 * Created by AliRashid on 01/12/15.
 */
public class API {


    ServerConnection servCon = new ServerConnection();

    public String login(User user) {

        String message = "";

        String jLogin = servCon.post(new Gson().toJson(user), "login");
        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(jLogin);
            JSONObject JO = (JSONObject) object;

            if (JO.get("userid") != null)
                user.setId((int) (long) JO.get("userid"));

            return jLogin;
        } catch (ParseException | JSONException e) {
            jLogin = "No input was recieved";
        }
        return jLogin;
    }

    public ArrayList<User> getUsers() {

        String jou = servCon.get("users"); //jou (JSONUser

        ArrayList<User> users = new Gson().fromJson(jou, new TypeToken<ArrayList<User>>() {
        }.getType());

        return users;
    }

    public String jCreate (Game game) {

        String jCreate = servCon.post(new Gson().toJson(game), "games/");
        JSONParser parser = new JSONParser();
        try{
            Object object = parser.parse(jCreate);
            JSONObject JO = (JSONObject) object;

            jCreate = (String) JO.get("games");

        }catch (ParseException e){
            e.printStackTrace();
        }

        return jCreate;
    }
}




