package fridayexercises1.Week2.Arrays;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Slot " +  i + " contains " + arr[i]);
        }
    }
}
