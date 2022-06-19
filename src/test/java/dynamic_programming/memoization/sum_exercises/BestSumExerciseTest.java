package dynamic_programming.memoization.sum_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.memoization.sum_exercises.BestSumExercise.bestSumWithMemo;
import static dynamic_programming.memoization.sum_exercises.BestSumExercise.bestSumWithoutMemo;

public class BestSumExerciseTest {

    @Test
    public void test1() {
        var start = System.currentTimeMillis();
        System.out.println(bestSumWithoutMemo(3, new int[]{1,2})); // [1,2]
        System.out.println(bestSumWithoutMemo(7, new int[]{5,3,4,7})); // [7]
        System.out.println(bestSumWithoutMemo(8, new int[]{2,3,5})); // [3,5]
        System.out.println(bestSumWithoutMemo(8, new int[]{1,4,4})); // [4,4]
//        System.out.println(bestSumWithoutMemo(100, new int[]{1,2,5,25})); // [25,25,25,25]
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }

    @Test
    public void test2() {
        var start = System.currentTimeMillis();
        System.out.println(bestSumWithMemo(3, new int[]{1,2}, new HashMap<>())); // [1,2]
        System.out.println(bestSumWithMemo(7, new int[]{5,3,4,7}, new HashMap<>())); // [7]
        System.out.println(bestSumWithMemo(8, new int[]{2,3,5}, new HashMap<>())); // [3,5]
        System.out.println(bestSumWithMemo(8, new int[]{1,4,4}, new HashMap<>())); // [4,4]
        System.out.println(bestSumWithMemo(100, new int[]{1,2,5,25}, new HashMap<>())); // [25,25,25,25]
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }
}
