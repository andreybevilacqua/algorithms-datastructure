package dynamic_programming;

import java.util.HashMap;

public class CanSumExercise {

    public static boolean canSum(int target, int[] ints, HashMap<Integer, Boolean> memo) {
        if(target == 0) return true;
        if(memo.containsKey(target)) return memo.get(target);
        var result = false;
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                result = canSum(diff, ints, memo);
                memo.put(diff, result);
                if(result) break;
            }
        }
        return result;
    }
}
