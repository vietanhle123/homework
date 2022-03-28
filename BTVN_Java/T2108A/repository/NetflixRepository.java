package BTVN_Java.T2108A.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import BTVN_Java.T2108A.model.Netflix1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;


import BTVN_Java.T2108A.model.Netflix1;

public class NetflixRepository {

    public List<Netflix1> netflixList;

    public void getData(){
        try{
            //doc file json vooiws flieReader
            FileReader reader = new FileReader("netflix.json");
            //Convert JSON text to  -> Objects
            Type objectType = new TypeToken<List<Netflix1>>(){}.getType();
            netflixList = new Gson().fromJson(reader,objectType);// chua danh sach cach doi tuong dc convert sang

            for (Netflix1 netflix: netflixList) {
                System.out.println(netflix);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
