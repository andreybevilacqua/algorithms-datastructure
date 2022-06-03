package dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BestSumExercise {

    public static List<Integer> bestSumWithoutMemo(int target, int[] ints) {
        if(target == 0) return new ArrayList<>();
        List<Integer> shortestCombination = null;
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                var remainderCombination = bestSumWithoutMemo(diff, ints);
                if(remainderCombination != null) {
                    remainderCombination.add(i);
                    if(shortestCombination == null ||
                       remainderCombination.size() < shortestCombination.size()) {
                        shortestCombination = remainderCombination;
                    }
                }
            }
        }
        return shortestCombination;
    }

    public static ArrayList<Integer> bestSumWithMemo(int target, int[] ints, HashMap<Integer, ArrayList<Integer>> memo) {
        if(target == 0) return new ArrayList<>();
        if(memo.containsKey(target)) return memo.get(target);
        ArrayList<Integer> shortestCombination = null;
        for(int i : ints) {
            var diff = target - i;
            if(diff >= 0) {
                var remainderCombination = bestSumWithMemo(diff, ints, memo);
                if(remainderCombination != null) {
                    var combination = new ArrayList<>(remainderCombination);
                    combination.add(i);
                    if(shortestCombination == null ||
                       combination.size() < shortestCombination.size()) {
                        shortestCombination = combination;
                    }
                }
            }
        }
        memo.put(target, shortestCombination);
        return shortestCombination;
    }
}
