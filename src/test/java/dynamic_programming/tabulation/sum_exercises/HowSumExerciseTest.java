package dynamic_programming.tabulation.sum_exercises;

import org.junit.Test;

import java.util.Arrays;

import static dynamic_programming.tabulation.sum_exercises.HowSumExercise.howSum;

public class HowSumExerciseTest {

    @Test
    public void test1() {
        System.out.println(Arrays.toString(howSum(7, new int[]{2, 3}))); // [3,2,2]
        System.out.println(Arrays.toString(howSum(7, new int[]{5,3,4}))); // [4,3] or [3,4]
        System.out.println(Arrays.toString(howSum(7, new int[]{5,3,4,7}))); // [4,3] or [3,4] or [7]
        System.out.println(Arrays.toString(howSum(7, new int[]{2,4}))); // null
        System.out.println(Arrays.toString(howSum(8, new int[]{2,3,5}))); // [2,2,2,2]
        System.out.println(Arrays.toString(howSum(300, new int[]{7,14}))); // null
    }
}
