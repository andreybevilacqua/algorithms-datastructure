package dynamic_programming;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.CanSumExercise.canSum;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanSumExerciseTest {

    @Test
    public void test1() {
        assertTrue(canSum(3, new int[]{1,2}, new HashMap<>()));
        assertTrue(canSum(7, new int[]{5,3,4,7}, new HashMap<>()));
        assertTrue(canSum(8, new int[]{2,3,5}, new HashMap<>()));
        assertFalse(canSum(3, new int[]{2,2}, new HashMap<>()));
        assertFalse(canSum(7, new int[]{8,9}, new HashMap<>()));
        assertFalse(canSum(300, new int[]{7,14}, new HashMap<>()));
    }
}
