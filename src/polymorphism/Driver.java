package polymorphism;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        SoftwareDeveloper rick = new SoftwareDeveloper("50", 70000, new Date(), "Java ");
        Designer bianca = new Designer("35", 70000, new Date(), true);
        ProductManager shohei = new ProductManager("51", 70000, new Date(), "#123");
        DataScientist wenda = new DataScientist("30", 70000, new Date(), "#123-d");

        // I want to create an array (collection) to store all my Employees.
        // So, I can calculate the total salary for my team.
        Employee[] dreamTeam = {rick, bianca, shohei, wenda};
        int totalSalary = 0;
        for (Employee employee : dreamTeam) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total salary: " + totalSalary);

        // I want to know Rick's specialty
        // Compile-time => Rick is Employee type
        // Run-time => Because Rick is actually SoftwareDeveloper, we can down-cast rick to SoftwareDeveloper.
        System.out.println(((SoftwareDeveloper) dreamTeam[0]).getSpecialty());

        // What if Software Developer always (secretly) get bonus (+ $20,000)

        for(Employee emp: dreamTeam)
            emp.work();

    }
}
