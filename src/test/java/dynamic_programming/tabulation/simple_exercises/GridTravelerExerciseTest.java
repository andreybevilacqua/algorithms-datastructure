package dynamic_programming.tabulation.simple_exercises;

import org.junit.Test;

import static dynamic_programming.tabulation.simple_exercises.GridTravelerExercise.gridTraveler;
import static org.junit.Assert.assertEquals;

public class GridTravelerExerciseTest {

    @Test
    public void test1() {
        assertEquals(0, gridTraveler(0,1));
        assertEquals(1, gridTraveler(1,1));
        assertEquals(3, gridTraveler(2,3));
        assertEquals(6, gridTraveler(3,3));
        assertEquals(2333606220L, gridTraveler(18,18));
    }
}
