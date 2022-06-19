package dynamic_programming.memoization.simple_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.memoization.simple_exercises.FibonacciExercise.fibIterative;
import static dynamic_programming.memoization.simple_exercises.FibonacciExercise.fibRecursive;
import static org.junit.Assert.assertEquals;

public class FibonacciExerciseTest {

    @Test
    public void fibRecursiveTest() {
        assertEquals(8, fibRecursive(6, new HashMap<>()));
        assertEquals(8, fibIterative(6));
        assertEquals(13, fibRecursive(7, new HashMap<>()));
        assertEquals(21, fibRecursive(8, new HashMap<>()));
        assertEquals(12586269025L, fibRecursive(50, new HashMap<>()));
        assertEquals(12586269025L, fibIterative(50));
    }
}
