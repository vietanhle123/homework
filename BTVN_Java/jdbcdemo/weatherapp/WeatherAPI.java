package BTVN_Java.jdbcdemo.weatherapp;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WeatherAPI {
    private  String Keys;
    private  String City;
    private  String Country;

    Gson gson = new Gson();

    public WeatherAPI(String keys, String city, String country) {
        Keys = keys;
        City = city;
        Country = country;
    }

    public static String getJsonApi(String link) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL(link);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    public static String getLink(){
        String link = "https://api.openweathermap.org/data/2.5/weather?q=hanoi&appid=c2337302aa005cefe644fca88c28fdc7&units=metric&quot";
        return link;
    }

    public  WeatherRoot getweatherData() throws IOException {
        WeatherRoot weatherRoot = gson.fromJson(getJsonApi(getLink()),WeatherRoot.class);
        return  weatherRoot;
    }

    public static void main(String[] args) throws IOException {
        //WeatherAPI weatherAPI = new WeatherAPI();

        //System.out.println(WeatherAPI.getWeatherData().getCoord().lon);
        //System.out.println(WeatherAPI.getWeatherData().getCoord().lat);

        String data = getJsonApi(getLink());
        System.out.println(data);
    }
}
