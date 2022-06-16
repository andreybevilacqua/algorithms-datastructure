package dynamic_programming.sum_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.sum_exercises.CanSumExercise.canSumWithMemo;
import static dynamic_programming.sum_exercises.CanSumExercise.canSumWithoutMemo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanSumExerciseTest {

    @Test
    public void testWithoutMemo() {
        var start = System.currentTimeMillis();
        assertTrue(canSumWithoutMemo(3, new int[]{1,2}));
        assertTrue(canSumWithoutMemo(7, new int[]{5,3,4,7}));
        assertTrue(canSumWithoutMemo(8, new int[]{2,3,5}));
        assertFalse(canSumWithoutMemo(3, new int[]{2,2}));
        assertFalse(canSumWithoutMemo(7, new int[]{8,9}));
        assertFalse(canSumWithoutMemo(300, new int[]{7,14}));
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }

    @Test
    public void testWithMemo() {
        var start = System.currentTimeMillis();
        assertTrue(canSumWithMemo(3, new int[]{1,2}, new HashMap<>()));
        assertTrue(canSumWithMemo(7, new int[]{5,3,4,7}, new HashMap<>()));
        assertTrue(canSumWithMemo(8, new int[]{2,3,5}, new HashMap<>()));
        assertFalse(canSumWithMemo(3, new int[]{2,2}, new HashMap<>()));
        assertFalse(canSumWithMemo(7, new int[]{8,9}, new HashMap<>()));
        assertFalse(canSumWithMemo(300, new int[]{7,14}, new HashMap<>()));
        var end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }
}
