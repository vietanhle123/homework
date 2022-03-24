package BTVN_Java.authentication;

import java.util.List;
import java.util.Scanner;

public class Controller {
    String username;
    String password;
    Repository repository = new Repository();
    List<User> user = repository.getData();
    Scanner scanner = new Scanner(System.in);

    public void home() {
        Menu.mainMenu();

        int choose = scanner.nextInt();
        scanner.nextLine();
        switch( choose) {
            case 1:
                Login();
                break;
            case 2:
                createNewAccount();
                break;
            default:
                break;
        }
    }

    public void Login(){
        boolean checkLogin = false;
        while (!checkLogin) {
            System.out.println("Nhập tên đăng nhập :");
            username = scanner.nextLine();
            int count = 0;
            for(int i = 0; i <user.size(); i++){
                if( username.equals(user.get(i).getusername())){
                    count++;
                    System.out.println("nhập mật khẩu :");
                    password = scanner.nextLine();
                    if(password.equals(user.get(i).getpassword())){
                        loginSuccess();
                        checkLogin= true;
                    } else {
                        loginfail();
                        break;
                    }
                }
            }
            if( count == 0) {
                System.out.println("Kiểm  tra lại username");
            }
        }
    }

    public void loginSuccess(){
        System.out.println("chào  mừng" + username + ", bạn có  thể thực hiện các công việc sau :");
        Menu.loginSuccess();
        int choose = scanner.nextInt();
        switch ( choose) {
            case 1:
                changeUsername();
                break;
            case 2:
                changeEmail();
                break;
            case 3:
                chengePassword();
                break;
            case 4:
                home();
                break;
            case 0:
                System.out.println("tạm biệt!!!");
                System.exit(1);
            default:
                break;
        }
    }

    public void changeUsername(){
        boolean check = false;
        while(!check) {
            try{
                System.out.println("nhập user mới: ");
                String newUsername = scanner.nextLine();
                for(int i =0; i < user.size(); i++){
                    if(username.equals(user.get(i).getusername())){
                        if(!newUsername.equals(user.get(i).getusername())){
                            user.get(i).setusername(newUsername);
                            username = newUsername;
                            System.out.println("Thay đổi username thành  công");
                            check = true;
                        }else {
                            throw new RuntimeException("Username đã tồn  tại");
                        }
                    }
                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage() + ", vui lòng nhập lại username");
            }
        }
        loginSuccess();
    }

    public void changeEmail(){
        boolean check = false;
        String newPassword = null;
        while (!check) {
            try{
                System.out.println("Nhập Passworrd mới");
                newPassword = Validate.validateEmail(scanner.nextLine());
                for(int i = 0; i < user.size(); i++){
                    if(username.equals(user.get(1).getusername())){
                        if(!newPassword.equals(user.get(1).getemail())){
                            user.get(1).setemail(newPassword);
                            System.out.println(" Password đã được dùng, vui lòng nhập Password mới.");
                        }else{
                            throw new RuntimeException("vui lòng nhập lại Password.");
                        }
                    }
                    check = true;
                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage() + ",Thay đổi password thành  công ");
            }
        }
        loginSuccess();
    }


    public void chengePassword(){
        boolean check = false;
        String newEmail = null;
        while (!check) {
            try{
                System.out.println("Nhập email mới");
                newEmail = Validate.validateEmail(scanner.nextLine());
                for(int i = 0; i < user.size(); i++){
                    if(username.equals(user.get(1).getusername())){
                        if(!newEmail.equals(user.get(1).getemail())){
                            user.get(1).setemail(newEmail);
                            System.out.println("Thay đổi email thành  công");
                        }else{
                            throw new RuntimeException("Email đã tồn  tại");
                        }
                    }
                    check = true;
                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage() + ",vui lòng nhập lại email");
            }
        }
        loginSuccess();
    }

    public void loginfail(){
        Menu.loginfail();
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.println("Đăng nhập lại: ");
                Login();
                break;
            case 2:
                forgotpassword();
                break;            
        }
    }

    public  void forgotpassword(){
        System.out.println("vui lòng nhập email của  bạn :");
        String email = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < user.size(); i++){
            if(email.equals(user.get(i).getemail())){
                count++;
                boolean check = false;
                while (!check){
                    try {
                        System.out.println("Nhập lại mật khẩu mới:");
                        String newPassword = Validate.validatePassword(scanner.nextLine());
                        user.get(i).setpassword(newPassword);
                        System.out.println("đổi  mật khẩu thành  công, tiến  hành  đăng  nhập lại: ");
                        check = true;
                        Login();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage() + ", vui lòng  nhập lại. ");
                    }
                }
            }
        }if (count == 0){
            System.out.println("Email không tồn  tại, hãy nhập email");
            forgotpassword();
        }
    }

    public void createNewAccount(){
        boolean check = false;
        long Id = 0;
        String newUsername = null;
        String newEmail = null;
        String newPassword = null;
        while(!check){
            try{
                Id = user.size() + 1;
                System.out.println("nhập username:");
                newUsername = scanner.nextLine();
                System.out.println("nhập email: ");
                newEmail = scanner.nextLine();
                System.out.println("nhập password");
                newPassword = Validate.validatePassword(scanner.nextLine());
                for(int i = 0;i < user.size();i++ ){
                    if(newUsername.equals(user.get(i).getusername())) throw new RuntimeException("username đã tồn  tại");
                    if(newEmail.equals(user.get(i).getemail())) throw new RuntimeException("Email đã tồn tại");
                }
                check = true;
            }catch (RuntimeException e) {
                System.out.println(e.getMessage() + ", vui lòng  thực hiện lại");
            }
        }
        user.add(new User(Id, newUsername, newEmail, newPassword));
        System.out.println("đănhg ký  thành công.");
        System.out.println("tiến hành  đăng nhập.");
        Login();
    }
}
