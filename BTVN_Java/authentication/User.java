package BTVN_Java.authentication;

public class User {

    private long Id;
    private String username;
    private String email;
    private String password;

    public User(long id, String username, String email, String password){
        this.Id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId(){
        return Id;
    }
    
    public void setId(long Id){
        this.Id = Id; 
    }

    public String getusername(){
        return username;
    }

    public void setusername(String username){
        this.username = username;
    }

    public String getemail(){
        return email;
    }

    public void  setemail(String email){
        this.email = email;
    }

    public String getpassword(){
        return password;
    }

    public void setpassword(String password){
        this.password = password;
    }
    
    @Override
    public String toString(){
        return Id + " - " + username + " - " + " - " + email + " - " + password;
    }
}
