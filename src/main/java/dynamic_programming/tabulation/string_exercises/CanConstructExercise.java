package dynamic_programming.tabulation.string_exercises;

public class CanConstructExercise {

    public static boolean canConstruct(String target, String[] words) {
        if(target.isEmpty()) return true;
        var result = new boolean[target.length() + 1];
        result[0] = true;
        for(int i = 0; i < result.length; i++) {
            if(result[i]) {
                for(String word : words) {
                    if(checkIfWordIsPrefixOfTargetOnIndex(word, target, i)) {
                        var targetPosition = i + word.length();
                        if(targetPosition < result.length) result[targetPosition] = true;
                    }
                }
            }
        }
        return result[target.length()];
    }

    private static boolean checkIfWordIsPrefixOfTargetOnIndex(String word, String target, int index) {
        return target.substring(index).indexOf(word) == 0;
    }
}
