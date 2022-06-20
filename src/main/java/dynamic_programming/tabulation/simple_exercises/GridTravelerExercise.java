package dynamic_programming.tabulation.simple_exercises;

public class GridTravelerExercise {

    public static long gridTraveler(int lines, int columns) {
        if(lines == 0 || columns == 0) return 0;
        var grid = new long[lines + 1][columns + 1];
        grid[1][1] = 1;
        for(int line = 0; line < grid.length; line++) {
            for(int column = 0; column < grid[0].length; column++){
                var current = grid[line][column];
                if(line + 1 < grid.length) grid[line + 1][column] += current;
                if(column + 1 < grid[0].length) grid[line][column + 1] += current;
            }
        }
        return grid[lines][columns];
    }
}
