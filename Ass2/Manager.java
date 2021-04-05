abstract class Employee {
    public abstract void designation();
}

public class Manager extends Employee {
    public void designation()
    {
        System.out.println("Designation: Manager.");
    }
    public static void main(String args[])
    {
        Employee m1 = new Manager();
        m1.designation();
    }
}