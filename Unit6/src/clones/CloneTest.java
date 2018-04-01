package clones;

/**
 * this program demonstrates cloning
 * @version 2018-3-30
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee origin = new Employee("join", 500);
            origin.setHireDay(2000, 1, 1);
            Employee copy = origin.clone();
            copy.raiseSaray(10);
            copy.setHireDay(2002, 2, 2);
            System.out.println("origin=" + origin);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
