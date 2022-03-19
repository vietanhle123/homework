package BTVN_Java.lab_8.entity;

import java.util.Scanner;
public class Student_1 {

    private int  id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student_1(int id, String firstName, String  lastName, double mark){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public void Scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        this.id = scanner.nextInt();
        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter mark: ");
        this.mark = scanner.nextDouble();
    }

    public void printlnfo(){
        System.out.printf("%3d|%10s%10s|%5f\n", getId(), getFirstName(), getLastName(), getMark());
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getId(){
        return id;
    }

    public double getMark() {
        return mark;
    }
}
