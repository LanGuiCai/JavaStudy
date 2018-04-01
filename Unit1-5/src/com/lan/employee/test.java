package com.lan.employee;

import java.util.function.DoubleBinaryOperator;

public class test {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Teacher("lan", 5000, 2018, 12, 01);
        people[1] = new Student("gui", "science");

        for (Person p :
                people) {
            System.out.println(p.getName()+p.getDescription());
        }
    }
    public enum Size{
        SMALL("S"),MEDIUM("M");
        private String abbreviation;

        private Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }
}
