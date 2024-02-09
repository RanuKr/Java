// Abstract class Employee
public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Abstract method to calculate the salary
    public abstract double calculateSalary();
}
