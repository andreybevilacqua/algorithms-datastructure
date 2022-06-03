package dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class HowSumExercise {

    // m = target sum
    // n = ints.length
    // time complexity: O(n^m)
    // space complexity: O(m)
    public static ArrayList<Integer> howSumWithoutMemo(int target, int[] ints) {
        if(target == 0) return new ArrayList<>();
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                var remainderResult = howSumWithoutMemo(diff, ints);
                if(remainderResult != null) {
                    remainderResult.add(i);
                    return remainderResult;
                }
            }
        }
        return null;
    }

    // time complexity: O(n*m)
    // space complexity: O(m^2)
    public static ArrayList<Integer> howSumWithMemo(int target, int[] ints, HashMap<Integer, ArrayList<Integer>> memo) {
        if(target == 0) return new ArrayList<>();
        if(memo.containsKey(target)) return memo.get(target);
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                var remainderResult = howSumWithMemo(diff, ints, memo);
                if(remainderResult != null) {
                    remainderResult.add(i);
                    memo.put(target, remainderResult);
                    return memo.get(target);
                }
            }
        }
        // You have to memorize the null results as well, so you don't need to compute them again.
        memo.put(target, null);
        return null;
    }
}
