package dynamic_programming.string_exercises;

import java.util.HashMap;

public class CanConstructExercise {

    public static boolean canConstruct(String target, String[] wordBank, HashMap<String, Boolean> memo) {
        if(target.isEmpty()) return true;
        if(memo.containsKey(target)) return memo.get(target);
        for(String word : wordBank) {
            if(target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());
                if(canConstruct(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }
}
