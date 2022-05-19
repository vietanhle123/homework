package BTVN_Java.jdbcdemo.weatherapp;

import java.io.IOException;

public class WeatherApplication {
    public static  void main(String[] args) throws IOException {
        WeatherAPI weatherAPI = new WeatherAPI("c2337302aa005cefe644fca88c28fdc7","hanoi","vn");
        System.out.println(weatherAPI.getweatherData().getCoord().lon);
        System.out.println(weatherAPI.getweatherData().getCoord().lat);
    }
}
