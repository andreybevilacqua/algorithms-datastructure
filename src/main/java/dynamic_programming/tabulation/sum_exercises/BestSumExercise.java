package dynamic_programming.tabulation.sum_exercises;

public class BestSumExercise {

    public static int[] bestSum(int target, int[] numbers) {
        if(target < 1) return new int[]{};
        var result = new int[target + 1][];
        result[0] = new int[]{};
        for(int i = 0; i < result.length; i++) {
            if(result[i] != null) {
                for(int number : numbers) {
                    var destination = i + number;
                    if((destination) < result.length) {
                        var overwriteArray = createOverwriteArray(result[i], number);
                        if(result[destination] == null) result[destination] = overwriteArray;
                        else {
                            if(overwriteArray.length < result[destination].length) result[destination] = overwriteArray;
                        }
                    }
                }
            }
        }
        return result[target];
    }

    private static int[] createOverwriteArray(int[] source, int number) {
        var tempArray = new int[source.length + 1];
        System.arraycopy(source, 0, tempArray, 0, source.length);
        tempArray[tempArray.length - 1] = number;
        return tempArray;
    }
}
