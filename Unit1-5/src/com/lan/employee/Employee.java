package com.lan.employee;

import java.util.Random;

public class Employee {
    private static int nextID;

    private int ID;
    private String name = "";
    private double saraly;

    static {
        Random generator = new Random();
        nextID = generator.nextInt(100);
    }

    {
        ID = nextID;
        nextID++;
    }

    public Employee(String n,double s) {
        name = n;
        saraly = s;
    }

    public Employee(double saraly) {
        this("Employee #" + nextID, saraly);
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSaraly() {
        return saraly;
    }

    public int getID() {
        return ID;
    }
}