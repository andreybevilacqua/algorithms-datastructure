package dynamic_programming.string_exercises;

import java.util.HashMap;

public class CountConstructExercise {

    public static int countConstruct(String target, String[] words, HashMap<String, Integer> memo) {
        if(target.isEmpty()) return 1;
        if(memo.containsKey(target)) return memo.get(target);
        var totalWaysCount = 0;
        for(String word : words) {
            if(target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());
                var numberOfWays = countConstruct(suffix, words, memo);
                totalWaysCount += numberOfWays;
            }
        }
        memo.put(target, totalWaysCount);
        return totalWaysCount;
    }
}
