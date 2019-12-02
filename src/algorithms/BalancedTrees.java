package algorithms;

import java.util.Scanner;

public class BalancedTrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] dp = new int[N+1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            for (int k = 2; k <= i; k++) {
                dp[i] += dp[i / k];
            }
        }
        System.out.println(dp[N]);
    }
}
