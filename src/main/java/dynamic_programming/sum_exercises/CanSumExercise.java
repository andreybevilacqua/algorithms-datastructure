package dynamic_programming.sum_exercises;

import java.util.HashMap;

public class CanSumExercise {

    public static boolean canSumWithoutMemo(int target, int[] ints) {
        if(target == 0) return true;
        var result = false;
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                result = canSumWithoutMemo(diff, ints);
                if(result) break;
            }
        }
        return result;
    }

    public static boolean canSumWithMemo(int target, int[] ints, HashMap<Integer, Boolean> memo) {
        if(target == 0) return true;
        if(memo.containsKey(target)) return memo.get(target);
        var result = false;
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                result = canSumWithMemo(diff, ints, memo);
                memo.put(diff, result);
                if(result) break;
            }
        }
        return result;
    }
}
