package BTVN_Java.jdbcdemo.accuweather;

public class Temperature {
    private  double vlaue;
    private String unit;
    private Integer unitType;

    public Temperature(double vlaue, String unit, Integer unitType) {
        this.vlaue = vlaue;
        this.unit = unit;
        this.unitType = unitType;
    }

    public double getVlaue() {
        return vlaue;
    }

    public String getUnit() {
        return unit;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setVlaue(double vlaue) {
        this.vlaue = vlaue;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }
}
