package BTVN_Java.lab_8;

import BTVN_Java.Student;
import BTVN_Java.lab_8.entity.Student_1;
import BTVN_Java.lab_8.model.StudentList;

import java.util.*;
public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList List;

    public static void menu(){
        System.out.println("1. Add a new student to the list: ");
        System.out.println("2. Delete a student from the  list: ");
        System.out.println("3. Search by name: ");
        System.out.println("4. Search by id: ");
        System.out.println("5. Print student info in descending order of mark: ");
        System.out.println("6. Exit.");
    }

    public static void main(String[] args){
        List = new StudentList();
        menu();

        while(true){
            int choice;
            System.out.println("#: ");
            choice = input.nextInt();
            if(choice == 1){
                addStudent();
                menu();
            }else if( choice == 2) {
                deleteStudent();
                menu();
            }else if( choice == 3){
                searchByName();
                menu();
            }else if( choice == 4){
                searchById();
                menu();
            }else if( choice == 5){
                printSorted();
                menu();
            }else if( choice == 6) {
                System.exit(0);
            }
        }
    }

    public static void addStudent(){
        int id = 0;
        String fn;
        String ln;
        double mark;
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        System.out.println("Enter first name: ");
        fn = input.next();
        System.out.println("Enter last name: ");
        ln = input.next();
        System.out.println("Enter mark: ");
        mark = input.nextDouble();
        Student s = new Student(id, fn, ln, mark);
        List.add(s);
    }

    public static void deleteStudent(){
        int id;
        System.out.println("Enter student id: ");
        id = input.nextInt();
        List.remove(id);
    }

    public static void searchByName(){
        int id;
        System.out.println("Enter an Id: ");
        id = input.nextInt();
        Student s = List.findById(id);
        if(s==null){
            System.out.println("Not Found");
        } else {
            s.printlnfo();
        }
    }

    public static void searchById() {
        int id;
        System.out.println("Enter an Id: ");
        id = input.nextInt();
        Student s = List.findById(id);
        if(s==null) {
            System.out.println("Not found");
        } else {
            s.printlnfo();
        }
    }

    public static void printSorted(){
        List.sortByMarks();
        List.showList();
    }
}
