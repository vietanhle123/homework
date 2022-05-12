package BTVN_Java.jdbcdemo.mvc.view;

import BTVN_Java.jdbcdemo.mvc.entity.Users;
import BTVN_Java.jdbcdemo.mvc.controller.LoginController;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsole {
    //Step 1
    LoginController loginController = new LoginController();
    Users users = new Users();

    private final Scanner sc;

    public LoginConsole() {
        this.sc = new Scanner(System.in);
    }


    public int menu(){
        System.out.println("---Login---");
        System.out.println("1. Login Statement");
        System.out.println("2. Login PreparedStatement");
        System.out.println("3. Exit");
        int choice = readInt(0,3);
        return choice;
    }
    public int readInt(int min, int max){
        int choice;
        while (true){
            try{
                choice = Integer.parseInt(sc.nextLine());
                if(choice >=min && choice <=max){
                    break;
                }

            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        return choice;
    }
    public void start() throws SQLException, ClassNotFoundException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0: System.exit(0);break;
                case 1: loginStatement();break;
                case 2: loginPreparedStatement();break;
                default:throw new AssertionError();
            }
        }
    }


    private void loginStatement() throws SQLException, ClassNotFoundException {
        //Enter the username
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        users.setUserName(username);
        //password
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        users.setPassword(password);
        //Step 1
        String result = loginController.loginStatementController(users);
        System.out.println(result);

    }
    private void loginPreparedStatement() throws SQLException, ClassNotFoundException {

        //Enter the username
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        users.setUserName(username);
        //password
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        users.setPassword(password);
        //Step 1
        String result = loginController.loginPreparedStatementController(users);
        System.out.println(result);
    }


}
