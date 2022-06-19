package dynamic_programming.memoization.simple_exercises;

import java.util.HashMap;

public class FibonacciExercise {

    public static long fibRecursive(int n, HashMap<Integer, Long> memo) {
        if(memo.containsKey(n)) return memo.get(n);
        if(n <= 2) return 1;
        memo.put(n, fibRecursive(n-1, memo) + fibRecursive(n-2, memo));
        return memo.get(n);
    }

    public static long fibIterative(int n) {
        long[] values = new long[n + 1];
        for(int i = 0; i < values.length; i++) {
            if(i <= 2) values[i] = 1;
            else values[i] = values[i-1] + values[i-2];
        }
        return values[n];
    }
}
