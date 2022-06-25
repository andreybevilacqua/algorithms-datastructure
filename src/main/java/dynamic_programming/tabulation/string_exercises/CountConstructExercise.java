package dynamic_programming.tabulation.string_exercises;

public class CountConstructExercise {

    public static int countConstruct(String target, String[] words) {
        if(target.isEmpty()) return -1;
        var result = new int[target.length() + 1];
        result[0] = 1;
        for(int i = 0; i < result.length; i++) {
            if(result[i] > 0) {
                for(String word : words) {
                    if(isWordPrefixOfTargetOnPositionIndex(word, target, i)) {
                        var targetPosition = i + word.length();
                        if(targetPosition < result.length) result[targetPosition] += result[i];
                    }
                }
            }
        }
        return result[target.length()];
    }

    private static boolean isWordPrefixOfTargetOnPositionIndex(String word, String target, int index) {
        return target.substring(index).indexOf(word) == 0;
    }
}
