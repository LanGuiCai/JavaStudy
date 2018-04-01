package com.lan;

import com.lan.employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("hadd", 300);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        for (Employee e : staff) {
            System.out.println("name="+e.getName()+",ID="+e.getID()
                    +",salary="+e.getSaraly());
        }
    }
}
