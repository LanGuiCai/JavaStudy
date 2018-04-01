package com.lan.employee;

import java.time.LocalDate;

public class Teacher extends Person {
    private double salary;
    private LocalDate hireDay;

    public Teacher(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $ %.2f", salary);
    }

    public void raiseSalary(double byPrecent) {
        double raise = salary * byPrecent / 100;
        salary += raise;
    }
}
