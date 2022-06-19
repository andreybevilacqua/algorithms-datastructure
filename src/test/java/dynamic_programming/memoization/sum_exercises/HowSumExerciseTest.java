package dynamic_programming.memoization.sum_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.memoization.sum_exercises.HowSumExercise.howSumWithMemo;
import static dynamic_programming.memoization.sum_exercises.HowSumExercise.howSumWithoutMemo;

public class HowSumExerciseTest {

    @Test
    public void testWithoutMemo() {
        var start = System.currentTimeMillis();
        System.out.println(howSumWithoutMemo(3, new int[]{1,2}));
        System.out.println(howSumWithoutMemo(7, new int[]{5,3,4,7}));
        System.out.println(howSumWithoutMemo(8, new int[]{2,3,5}));
        System.out.println(howSumWithoutMemo(3, new int[]{2,2}));
        System.out.println(howSumWithoutMemo(7, new int[]{8,9}));
        System.out.println(howSumWithoutMemo(300, new int[]{7,14}));
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }

    @Test
    public void testWithMemo() {
        var start = System.currentTimeMillis();
        System.out.println(howSumWithMemo(3, new int[]{1,2}, new HashMap<>()));
        System.out.println(howSumWithMemo(7, new int[]{5,3,4,7}, new HashMap<>()));
        System.out.println(howSumWithMemo(8, new int[]{2,3,5}, new HashMap<>()));
        System.out.println(howSumWithMemo(3, new int[]{2,2}, new HashMap<>()));
        System.out.println(howSumWithMemo(7, new int[]{8,9}, new HashMap<>()));
        System.out.println(howSumWithMemo(300, new int[]{7,14}, new HashMap<>()));
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }
}
