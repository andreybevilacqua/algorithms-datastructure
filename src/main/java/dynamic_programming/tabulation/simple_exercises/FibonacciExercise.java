package dynamic_programming.tabulation.simple_exercises;

public class FibonacciExercise {

    public static long fib(int n) {
        if(n < 2) return n;
        var table = new long[n + 1];
        table[1] = 1;
        for(int i = 2; i < table.length; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    public static long fibWithoutTable(int n) {
        if(n < 2) return n;
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = 1
        // i = 4
        // current = 3
        // previous = 2
        // temp = 1
        var currentValue = 1L;
        var previousValue = 1L;
        var temp = 0L;
        for(int i = 2; i <= n; i++) {
            currentValue = previousValue + temp;
            temp = previousValue;
            previousValue = currentValue;
        }
        return currentValue;
    }
}
