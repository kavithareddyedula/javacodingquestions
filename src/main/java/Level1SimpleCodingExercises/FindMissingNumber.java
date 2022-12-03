package Level1SimpleCodingExercises;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingNumber {

    public static int findMissingNumberUsingJdk8(int[] nos) {
        System.out.println("JDK1.8 - approach");
        int N = 12;
        int totalNoSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(nos).sum();
        System.out.println("total Number Sum = " + totalNoSum + " \ntotal Values Sum = " + sum);
        return totalNoSum - sum;
    }

    public static int findMissingNumberUsingForLoop(int[] nos) {
        System.out.println("\nFor loop - approach");
        int N = 12;
        int totalNoSum = (N * (N + 1)) / 2;
        int sum = 0;
        for (int n : nos) {
            sum += n;
        }
        System.out.println("total Number Sum = " + totalNoSum + " \ntotal Values Sum = " + sum);
        return totalNoSum - sum;
    }

    @DisplayName("Test FindMissingNumber.findMissingNumberUsingJdk8(int[] nos)")
    @Test
    void testFindMissingNumberUsingJdk8() {
        int[] nos = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12};
        int missingNumber = FindMissingNumber.findMissingNumberUsingJdk8(nos);
        System.out.println("Missing Number = " + missingNumber);
        assertEquals(6, missingNumber);
    }

    @DisplayName("Test FindMissingNumber.findMissingNumberUsingForLoop(int[] nos)")
    @Test
    void testFindMissingNumberUsingForLoop() {
        int[] nos = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12};
        int missingNumber = FindMissingNumber.findMissingNumberUsingForLoop(nos);
        System.out.println("Missing Number = " + missingNumber);
        assertEquals(6, missingNumber);
    }

}
