/*
 * Problem 5.3:
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 * You can either start from the step with index 0, or the step with index 1.
 * Return the minimum cost to reach the top of the floor.
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * output = 6;
 */

public class MinCostClimbing {

  public static int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 0; i < n; i++) {
      dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }

    return Math.min(dp[n - 1], dp[n - 2]);
  }

  public static void main(String... args) {
    int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
    int minCost = minCostClimbingStairs(cost);
    System.out.println("Minimum cost climbing stars is: " + minCost);
  }
}
