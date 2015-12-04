package SDK;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class ServerConnection {

    public ServerConnection() {
        this.hostAddress = "http://localhost";
        this.port = 8888;
    }

    private String hostAddress;
    private int port;

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    public String get(String path) {

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;
    }

    public String post(String json, String path) {

        Client client = Client.create();
        System.out.println(getHostAddress() + ":" + getPort() + "/api/" + path);
        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);
        return response.getEntity(String.class);
    }

    public String put(String json, String path) {

        Client client = Client.create();
        System.out.println(getHostAddress() + ":" + getPort() + "/api/" + path);
        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);
        return response.getEntity(String.class);
    }
}



