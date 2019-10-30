package polymorphism;

import java.util.Date;

// Abstract Class - (when you have subclasses, and don't need an instance of the superclass)
// - can't be instantiated (can't create an instance(object))
// - can have abstract methods.
public abstract class Employee {
    private String employeeId;
    private long salary;
    private Date startDate;

    public Employee(String employeeId, long salary, Date startDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public long getSalary() {
        return salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }

}
