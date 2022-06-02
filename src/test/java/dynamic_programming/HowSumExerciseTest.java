package dynamic_programming;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.HowSumExercise.howSum;

public class HowSumExerciseTest {

    @Test
    public void testWithoutMemo() {
        var start = System.currentTimeMillis();
        System.out.println(howSum(3, new int[]{1,2}));
        System.out.println(howSum(7, new int[]{5,3,4,7}));
        System.out.println(howSum(8, new int[]{2,3,5}));
        System.out.println(howSum(3, new int[]{2,2}));
        System.out.println(howSum(7, new int[]{8,9}));
        System.out.println(howSum(300, new int[]{7,14}));
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }

    @Test
    public void testWithMemo() {
        var start = System.currentTimeMillis();
        System.out.println(howSum(3, new int[]{1,2}, new HashMap<>()));
        System.out.println(howSum(7, new int[]{5,3,4,7}, new HashMap<>()));
        System.out.println(howSum(8, new int[]{2,3,5}, new HashMap<>()));
        System.out.println(howSum(3, new int[]{2,2}, new HashMap<>()));
        System.out.println(howSum(7, new int[]{8,9}, new HashMap<>()));
        System.out.println(howSum(300, new int[]{7,14}, new HashMap<>()));
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }
}
