package dynamic_programming.tabulation.sum_exercises;

public class CanSumExercise {

    public static boolean canSum(int target, int[] numbers) {
        if(target == 0) return true;
        var table = new boolean[target + 1];
        table[0] = true;
        for(int i = 0; i < table.length; i++) {
            if(table[i]) {
                for(int number : numbers) {
                    if((i + number) < table.length) table[i + number] = true;
                }
            }
        }
        return table[target];
    }
}
