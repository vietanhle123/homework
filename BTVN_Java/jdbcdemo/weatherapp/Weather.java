package BTVN_Java.jdbcdemo.weatherapp;

public class Weather {
    private int  id;
    private  String name;
    private  String description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Weather(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


}
