package dynamic_programming.tabulation.sum_exercises;

import org.junit.Test;

import static dynamic_programming.tabulation.sum_exercises.CanSumExercise.canSum;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanSumExerciseTest {

    @Test
    public void test1() {
        assertTrue(canSum(7, new int[]{2,3}));
        assertTrue(canSum(7, new int[]{5,3,4,7}));
        assertFalse(canSum(7, new int[]{2, 4}));
        assertTrue(canSum(8, new int[]{2, 3, 5}));
        assertFalse(canSum(300, new int[]{7, 14}));
    }
}
