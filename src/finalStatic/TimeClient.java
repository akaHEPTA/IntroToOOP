package finalStatic;

public class TimeClient {
    public static void main(String[] args) {
        Time t1 = new Time(23);
        Time t2 = new Time(9, 11, 23);
        Time t3 = new Time(23, 2, 5);
        Time t4 = new Time(22, 10);
        Time t5 = new Time();

        Time[] times = {t1, t2, t3, t4, t5};
        for(Time time: times) {
            System.out.println(time.toStandardForm());
            System.out.println(time.toUniversalForm());
        }

        System.out.println("I created Time objects " + Time.instanceCount + " times.");

    }
}
