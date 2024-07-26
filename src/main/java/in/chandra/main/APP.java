package in.chandra.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.chandra.JacksonApiApplication;
import in.chandra.binding.User;

import java.io.File;

public class APP {
    public static void main(String[] args) throws Exception {
        APP app = new APP();
       // app.convertObjToJson();
        app.convertJsonToObj();
    }

    public void convertObjToJson() throws Exception {
        User u = new User(101, "chandra", 123455L, "male");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("user.json"), u);//difference
        System.out.println("Java object converted to JSON Object");

    }

    public void convertJsonToObj() throws Exception {
        User u = new User(101, "chandra", 123455L, "male");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(new File("user.json"), User.class);//difference
        System.out.println("JSon object converted to Object");
    }
}
