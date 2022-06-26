package dynamic_programming.tabulation.string_exercises;

import java.util.Arrays;
import java.util.Objects;

public class AllConstructExercise {

    public static String[][] allConstruct(String target, String[] words) {
        if(target.isEmpty()) return null;
        var result = new String[target.length() + 1][][];
        result[0] = new String[][]{};
        for(int i = 0; i < result.length; i++) {
            if(result[i] != null) {
                for(String word : words) {
                    if(isWordPrefixOfTargetOnPositionIndex(word, target, i)) {
                        String[][] twoDimensionalArray = createNewCombinationArray(result, i, word);
                        var targetPosition = i + word.length();
                        if(targetPosition < result.length) {
                            if(result[targetPosition] == null) result[targetPosition] = twoDimensionalArray;
                            else concatenateArrays(twoDimensionalArray, result[targetPosition], result, targetPosition);
                        }
                    }
                }
            }
        }
        if(result[target.length()] != null)
            return Arrays
                    .stream(result[target.length()])
                    .filter(Objects::nonNull)
                    .toArray(String[][]::new);
        else return null;
    }

    private static boolean isWordPrefixOfTargetOnPositionIndex(String word, String target, int index) {
        return target.substring(index).indexOf(word) == 0;
    }

    private static String[][] createNewCombinationArray(String[][][] result, int currentIndex, String word) {
        var newCombinationArray = new String[result[currentIndex].length + 1][];
        if(result[currentIndex].length == 0) newCombinationArray[0] = new String[]{word};
        else {
            for(int j = 0; j < result[currentIndex].length; j++) {
                if(result[currentIndex][j] != null) {
                    var tempArray = createNewInternalArray(result[currentIndex][j], word);
                    newCombinationArray[j] = tempArray;
                }
            }
        }
        return newCombinationArray;
    }

    private static String[] createNewInternalArray(String[] source, String wordToAdd) {
        var tempCopyArray = new String[source.length + 1];
        System.arraycopy(source, 0, tempCopyArray, 0, source.length);
        tempCopyArray[tempCopyArray.length -1] = wordToAdd;
        return tempCopyArray;
    }

    private static void concatenateArrays(String[][] origin,
                                          String[][] destination,
                                          String[][][] result,
                                          int position) {
        var tempTwoDimensionalArray = new String[origin.length + destination.length][];
        var indexCounter = 0;
        for(int i = 0; i < origin.length; i++) {
            if(origin[i] != null) {
                tempTwoDimensionalArray[i] = origin[i];
                indexCounter++;
            }
        }
        for(String[] strings : destination) {
            if(strings != null) {
                tempTwoDimensionalArray[indexCounter] = strings;
                indexCounter++;
            }
        }
        result[position] = tempTwoDimensionalArray;
    }
}
