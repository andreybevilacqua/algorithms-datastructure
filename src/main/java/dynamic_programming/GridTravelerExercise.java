package dynamic_programming;

import java.util.HashMap;

public class GridTravelerExercise {

    public static long gridTraveler(int rows, int columns, HashMap<String, Long> memo) {
        var key = rows + "," + columns;
        if(memo.containsKey(key)) return memo.get(key);
        if(rows == 0 || columns == 0) return 0;
        if(rows == 1 && columns == 1) return 1;
        memo.put(key, gridTraveler(rows-1, columns, memo) +  gridTraveler(rows, columns -1, memo));
        return memo.get(key);
    }
}
