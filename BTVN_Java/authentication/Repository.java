package BTVN_Java.authentication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class Repository {
    public List<User> user;
    public List<User> getData(){
        try {
            FileReader reader = new FileReader("user.json");    

            Type objectType = new TypeToken<List<User>>(){
            }.getType();
            user = new Gson().fromJson(reader, objectType);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
