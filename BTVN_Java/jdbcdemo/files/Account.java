package BTVN_Java.jdbcdemo.files;

public class Account {
    private int id;
    private String name;
    private  String[] address;
    private String email;
    private  boolean isActive;

    public Account(){

    }

    public Account(int id, String name, String[] address, String email, boolean isActive) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
