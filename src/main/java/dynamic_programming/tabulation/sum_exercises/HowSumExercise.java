package dynamic_programming.tabulation.sum_exercises;

public class HowSumExercise {

    // target = 7
    // numbers = [5,3,4]
    // i = 3
    // result =
        // 0 = int[]{}
        // 1 = null
        // 2 = null
        // 3 = int[]{3}
        // 4 = int[]{4}
        // 5 = int[]{5}
        // 6 = int[]{3, 3}
        // 7 target = int[]{4, 3}
    public static int[] howSum(int target, int[] numbers) {
        if(target < 1) return new int[]{};
        var result = new int[target + 1][];
        result[0] = new int[]{};
        for(int i = 0; i < result.length; i++) {
            if(result[i] != null) {
                for(int number : numbers) {
                    if(i + number < result.length) result[i + number] = createOverwriteArray(result[i], number);
                }
            }
        }
        return result[target];
    }

    // source = int[]{3}
    // number = 3
    // tempArray.length = 2
    // tempArray = int[]{3, 3}
    private static int[] createOverwriteArray(int[] source, int number) {
        var tempArray = new int[source.length + 1];
        System.arraycopy(source, 0, tempArray, 0, source.length);
        tempArray[tempArray.length - 1] = number;
        return tempArray;
    }
}
