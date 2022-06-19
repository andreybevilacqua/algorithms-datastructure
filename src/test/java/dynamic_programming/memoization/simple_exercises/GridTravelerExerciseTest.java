package dynamic_programming.memoization.simple_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.memoization.simple_exercises.GridTravelerExercise.gridTraveler;
import static org.junit.Assert.assertEquals;

public class GridTravelerExerciseTest {

    @Test
    public void test1() {
        assertEquals(0, gridTraveler(0,1, new HashMap<>()));
        assertEquals(1, gridTraveler(1,1, new HashMap<>()));
        assertEquals(3, gridTraveler(2,3, new HashMap<>()));
        assertEquals(6, gridTraveler(3,3, new HashMap<>()));
        assertEquals(2333606220L, gridTraveler(18,18, new HashMap<>()));
    }
}
