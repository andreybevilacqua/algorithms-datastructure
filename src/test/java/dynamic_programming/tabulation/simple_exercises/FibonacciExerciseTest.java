package dynamic_programming.tabulation.simple_exercises;

import org.junit.Test;

import static dynamic_programming.tabulation.simple_exercises.FibonacciExercise.fib;
import static dynamic_programming.tabulation.simple_exercises.FibonacciExercise.fibWithoutTable;
import static org.junit.Assert.assertEquals;

public class FibonacciExerciseTest {

    @Test
    public void fibRecursiveTest() {
        assertEquals(8, fib(6));
        assertEquals(13, fib(7));
        assertEquals(21, fib(8));
        assertEquals(12586269025L, fib(50));
    }

    @Test
    public void fibRecursiveTest2() {
        assertEquals(8, fibWithoutTable(6));
        assertEquals(13, fibWithoutTable(7));
        assertEquals(21, fibWithoutTable(8));
        assertEquals(12586269025L, fibWithoutTable(50));
    }
}
