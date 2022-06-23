package dynamic_programming.tabulation.sum_exercises;

import org.junit.Test;

import java.util.Arrays;

import static dynamic_programming.tabulation.sum_exercises.BestSumExercise.bestSum;

public class BestSumExerciseTest {

    @Test
    public void test1() {
        System.out.println(Arrays.toString(bestSum(7, new int[]{5,3,4,7}))); // [7]
        System.out.println(Arrays.toString(bestSum(8, new int[]{2,3,5}))); // [3,5]
        System.out.println(Arrays.toString(bestSum(8, new int[]{1,4,5}))); // [3,5]
        System.out.println(Arrays.toString(bestSum(100, new int[]{1,2,5,20}))); // [20,20,20,20,20]
        System.out.println(Arrays.toString(bestSum(100, new int[]{1,2,5,20,25}))); // [25,25,25,25]
    }
}
