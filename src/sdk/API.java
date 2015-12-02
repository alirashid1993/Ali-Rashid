package SDK;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
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

        String data = servCon.post(new Gson().toJson(user), "login");
        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(data);
            JSONObject JO = (JSONObject) object;

            if (JO.get("userid") != null)
                user.setID((int) (long) JO.get("userid"));

            return message;
        } catch (ParseException | JSONException e) {
            message = "No input was recieved";
        }
        return message;
    }

    public ArrayList<User> getUsers() { //burde ikke bruge get-metode

        String jou = servCon.get("users");

        return new Gson().fromJson(jou, new TypeToken<ArrayList<User>>(){}.getType());
    }

}



