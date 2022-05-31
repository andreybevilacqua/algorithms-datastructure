package dynamic_programming;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.Fibonacci.fibIterative;
import static dynamic_programming.Fibonacci.fibRecursive;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

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
