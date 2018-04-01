package com.lan.employee;

public class Manager extends Employee {
    private double bouns;

    public Manager() {
        super();
        bouns = 0;
    }
    public double getSaraly() {
        double baseSaraly = super.getSaraly();
        return baseSaraly+bouns;
    }
}
