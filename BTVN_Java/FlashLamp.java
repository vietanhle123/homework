package BTVN_Java;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    public void FlashLam(){
        status=false;
    }

    public void setBattery(Battery battery) {
        this.battery=battery;
    }

    public int getBatteryÌno(){
        return battery.getEnergy();
    }

    public void Light(){
        if(status==true &&battery!=null&& battery.getEnergy()>0) {
            battery.decreaseEnergy();
        };
    }

    public void turnOn(){
        if(battery != null && battery.getEnergy()>0){
            status=true;
        }
        Light();
    }

    public void turnOff(){
        status=false;
    }
}
