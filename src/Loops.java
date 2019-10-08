public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.print(i + "\n");
            } else{
                System.out.print(i + ", ");
            }
        }

        // print even numbers from 1 to 10 using while-loop
        int i = 0;
        while (i  < 10) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
            i++;
        }
    }
}

/*
break: break out of the loop
continue: skip to the next iteration
for(;;) -> infinite loop
 */