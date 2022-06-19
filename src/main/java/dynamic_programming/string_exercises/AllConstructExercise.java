package dynamic_programming.string_exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllConstructExercise {

    public static ArrayList<ArrayList<String>> allConstruct(String target, String[] words) {
        if(target.isEmpty()) return new ArrayList<>();
        ArrayList<ArrayList<String>> result = null;
        for(String word : words) {
            if(target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());
                var suffixWays = allConstruct(suffix, words);
                if(suffixWays != null) {
                    suffixWays.add(0, new ArrayList<>(List.of(word)));
                    var combinations = new ArrayList<ArrayList<String>>();
                    var tempList = new ArrayList<String>();
                    suffixWays.forEach(tempList::addAll);
                    combinations.add(tempList);
                    if(result == null) result = combinations;
                    else result.addAll(combinations);
                }
            }
        }
        return result;
    }

    public static ArrayList<ArrayList<String>> allConstructWithMemoization(String target,
                                                                           String[] words,
                                                                           HashMap<String, ArrayList<ArrayList<String>>> memo) {
        if(target.isEmpty()) return new ArrayList<>();
        if(memo.containsKey(target)) return memo.get(target);
        ArrayList<ArrayList<String>> result = null;
        for(String word : words) {
            if(target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());
                var suffixWays = allConstructWithMemoization(suffix, words, memo);
                if(suffixWays != null) {
                    suffixWays.add(0, new ArrayList<>(List.of(word)));
                    var combinations = new ArrayList<ArrayList<String>>();
                    var tempList = new ArrayList<String>();
                    suffixWays.forEach(tempList::addAll);
                    combinations.add(tempList);
                    if(result == null) result = combinations;
                    else result.addAll(combinations);
                }
            }
        }
        memo.put(target, result);
        return result;
    }
}
