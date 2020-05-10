package com.schu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("What are you doing Frank?");
            System.out.println("Why, you brought 1 too many...");
        }).start();

        Employee john = new Employee("John", 32);
        Employee michael = new Employee("Michael", 50);
        Employee jack = new Employee("Jack", 21);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(michael);
        employeeList.add(jack);
        employeeList.add(snow);

        Collections.sort(employeeList, (e1, e2) -> e1.getName().compareTo(e2.getName()));

//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });
//
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }

    }
}

class Employee {
    private String name;
    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}