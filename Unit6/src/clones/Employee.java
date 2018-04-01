package clones;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double saraly;
    private Date hireDay;

    public Employee(String name, double saraly) {
        this.name = name;
        this.saraly = saraly;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        // call Object clone
        Employee clone = (Employee) super.clone();
        // clone
        clone.hireDay = (Date) hireDay.clone();

        return clone;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSaray(double byPercent) {
        double raise = saraly + byPercent / 100;
        saraly += raise;
    }

    public String toString() {
        return "Employee[name=" + name + ",salary=" + saraly + ",hireDay=" + hireDay + "]";
    }

}
