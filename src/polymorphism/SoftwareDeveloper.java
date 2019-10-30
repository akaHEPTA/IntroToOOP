package polymorphism;

import java.util.Date;

public class SoftwareDeveloper extends Employee {
    private String specialty;

    public SoftwareDeveloper(String employeeId, long salary, Date startDate, String specialty) {
        super(employeeId, salary, startDate);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println("I'm coding...");
    }

    @Override
    public long getSalary() {
        return super.getSalary() + 20000;
    }

    @Override
    public String toString() {
        return "SoftwareDeveloper{" +
                "specialty='" + specialty + '\'' +
                '}';
    }

}
