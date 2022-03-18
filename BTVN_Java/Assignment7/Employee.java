package BTVN_Java.Assignment7;

public class Employee {
    private String name;
    private int age;
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super();
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }

    public String getname() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    public int getage(){
        return age;
    }

    public void setage(){
        this.age = age;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(){
        this.employeeId = employeeId;
    }
    
    
    public String toString(){
        return "[name = " + name + ", age = " + age + ", employeeId =" + employeeId +"]";
    }
}
