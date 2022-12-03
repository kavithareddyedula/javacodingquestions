package Level1SimpleCodingExercises;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximizingTheProfit {

    public static int findMaximumProfit(int[] prices) {

        int maxProfit = -1;
        for (int i = 0; i < prices.length - 1; i++) {
            int tempProfit = -1;
            for (int j = i + 1; j < prices.length - 1; j++) {
                for (int n = j + 1; n < prices.length; n++) {
                    /*
                     noOfComponents to get profit is 3
                     */
                    if ((prices[i] < prices[j]) && (prices[j] < prices[n])) {
                        tempProfit = prices[i] * prices[j] * prices[n];
                        if (tempProfit > maxProfit) {
                            maxProfit = tempProfit;
                        }
                    }
                }
            }
        }
        return maxProfit;
    }


    @DisplayName("Test MaximizingTheProfit.testFindMaximumProfitByThreeComponentsHappyPath(int[] priceOfEachComponent)")
    @Test
    void testFindMaximumProfitByThreeComponentsHappyPath() {
        int[] priceOfEachComponent = {10, 2, -10, 6, 1, 0, 8};
        int missingNumber = MaximizingTheProfit.findMaximumProfit(priceOfEachComponent);
        System.out.println("Maximum Profit = " + missingNumber);
        assertEquals(96, missingNumber);
    }
    @DisplayName("Test MaximizingTheProfit.testFindMaximumProfitByThreeComponentsNegativeScenario(int[] priceOfEachComponent)")
    @Test
    void testFindMaximumProfitByThreeComponentsNegativeScenario() {
        int[] priceOfEachComponent = {10, 2, -10, 2, 1, 0, 8};
        int missingNumber = MaximizingTheProfit.findMaximumProfit(priceOfEachComponent);
        System.out.println("Maximum Profit = " + missingNumber);
        assertEquals(-1, missingNumber);
    }
    /**
     * https://www.hackerrank.com/contests/hourrank-27/challenges/maximizing-the-profit/problem
     *
     * A hardware company is building a machine with exactly  hardware components. There are many components available, and the profit factor of each component is known. The profit obtained by the machine is the product of the profit factors of the  hardware components used to build that machine.
     *
     * However, there is a catch. Three different components with numbers  can be used to build the machine if and only if their profit factors are .
     *
     * Calculate the maximum possible profit that a valid machine consisting of three components can have, or decide that it's impossible to build any machine. Complete the function maximumProfit which takes in the integer array denoting the profit factors of all components and returns a single integer denoting the answer.
     *
     * Input Format
     *
     * The first line contains a single integer , denoting the number of available components. Components are numbered  to .
     * The second line contains  space-separated integers , i.e the integer array  denoting the profit factors of the components.
     * Output Format
     *
     * Print  if it's impossible to build any machine. Otherwise, print a single integer denoting the maximum possible profit that a valid machine consisting of  components can have.
     *
     * Sample Input 0
     *
     * 7
     * 10 2 -10 6 1 0 8
     * Sample Output 0
     *
     * 96
     * Explanation 0
     */
}
