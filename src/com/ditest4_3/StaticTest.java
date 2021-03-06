package com.ditest4_3;

/**
 * Created by Searis on 2015/12/29.
 */
public class StaticTest {
    public static void main(String[] args) {
        //fill the staff arrary with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new com.ditest4_3.Employee("Tom", 40000);
        staff[1] = new com.ditest4_3.Employee("Dick", 60000);
        staff[2] = new com.ditest4_3.Employee("Harry", 65000);

        // print out information about all Employee objects
        for (com.ditest4_3.Employee e : staff) {
            e.setId();
            System.out.println("name=" +e.getName()+"   ,id="+e.getId()+",salary="+e.getSalary());
        }

        int n= Employee.getNextId();    //calls static method
        System.out.println("Next available id ="+n);

    }

}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(){};

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId; //set id to next available id
        nextId++;
    }

    public static int getNextId() {
        return nextId;  //return static field
    }


    public static void main(String[] args) {
        //unit test
        Employee e = new Employee("Harry", 5000);
        System.out.println(e.getName() + "    " + e.getSalary());
    }



}
