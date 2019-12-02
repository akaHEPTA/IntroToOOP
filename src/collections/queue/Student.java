package collections.queue;

public class Student implements Comparable {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        // pos: 'this' is greater than Object 'o'
        // 0: 'this' is equal to Object 'o'
        // neg: 'this' is less than Object 'o'
        // this   vs   o
        return ((Student) o).score - this.score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + "(" + score + ")";
    }
}
