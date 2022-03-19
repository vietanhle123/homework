package BTVN_Java.lab_8.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import BTVN_Java.Student;

import java.util.Collections;

public class StudentList {
    private ArrayList<Student> List;
    private int length;

    public StudentList() { List = new ArrayList<Student>(); }

    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for(Student s: List) {
            String fullName = new String("s.getFirstName() + ' ' + s.getLastName()").toLowerCase();
            if(fullName.matches("(.*)" + name.toLowerCase() + "(.*)")){
                matches.add(s);
                found = true;
            }
        }
        if (found == false){
            System.out.println("Not found");
        }
        return matches;
    }

    public Student findById(int id) {
        for(Student s:List){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public void add(Student s){ List.add(s);}

    public void remove(int id){
        boolean found = false;
        for(Student s: List) {
            if(s.getId() == id) {
                int choice;
                System.out.println("Are you sure deleting this student? (1.Yes 2.No)");
                choice = new Scanner(System.in).nextInt();
                if(choice == 1){
                    List.remove(s);
                    found = true;
                }
            }
        }
        if(found == false) {
            System.out.println("Can not find student with id " + id);
        }
    }

    public void sortByMarks(){
        Collections.sort(List, new Comparator<Student>() {
            @Override
            public int Compare(Student s1, Student s2){

                return new Double(s2.getMark()).compareTo(s1.getMark());
            }
        });
    }
    public void showList(){
        for(Student s:List) {
            s.printlnfo();
        }
    }

    public void showList(ArrayList<Student> sList){
        for(Student s: sList){
            s.printlnfo();
        }
    }
}
