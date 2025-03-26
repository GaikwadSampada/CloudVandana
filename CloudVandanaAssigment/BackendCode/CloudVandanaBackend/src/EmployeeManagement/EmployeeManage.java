package EmployeeManagement;

import java.util.*;

class Employee {
 private int id;
 private String name;
 private double salary;

 public Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 public void displayDetails() {
     System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
 }
}

public class EmployeeManage {

 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
     employees.add(new Employee(101, "Ram Shinde", 120000));
     employees.add(new Employee(102, "Siya Yadav", 20000));
     employees.add(new Employee(103, "Shree Yadav", 90000));

     System.out.println("Employee Details:");
     for (Employee emp : employees) {
         emp.displayDetails();
     }
 }
}