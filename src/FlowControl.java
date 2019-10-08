public class FlowControl {
    public static void main(String[] args) {
        // if-else statement

        int age = 12;
        if (age > 50) {
            System.out.println("Age is greater than 50");
        } else if (age > 30 && age <= 50) {
            System.out.println("30 < age <= 50");
        } else if (age > 10 && age <= 30) {
            System.out.println("10 < age <= 30");
        } else {
            System.out.println("age <= 10");
        }

        // switch statement
        int salary = 1_000_000;
        switch (salary) {
            case 1000000:
                System.out.println("Pretty good for everyone!");
                break;  // falls through without break
            case 50000:
                System.out.println("Pretty good Junior Developer!");
                break;
            case 45000:
                System.out.println("Junior Developer!");
                break;
        }

    }
}

/*
(): parenthesis
{}: curly braces
[]: square brackets
 */