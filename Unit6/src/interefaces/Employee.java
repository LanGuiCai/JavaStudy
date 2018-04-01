package interefaces;


public class Employee implements Comparable<Employee>{
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
