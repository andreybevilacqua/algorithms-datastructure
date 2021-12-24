package factories;

public final class MatrixFactory {

    public static char[][] createIslandCountMatrix() {
        var result = new char[6][6];
        result[0][0] = 'w';
        result[0][1] = 'l';
        result[0][2] = 'w';
        result[0][3] = 'w';
        result[0][4] = 'l';
        result[0][5] = 'w';

        result[1][0] = 'l';
        result[1][1] = 'l';
        result[1][2] = 'w';
        result[1][3] = 'w';
        result[1][4] = 'l';
        result[1][5] = 'w';

        result[2][0] = 'w';
        result[2][1] = 'l';
        result[2][2] = 'w';
        result[2][3] = 'w';
        result[2][4] = 'w';
        result[2][5] = 'w';

        result[3][0] = 'w';
        result[3][1] = 'w';
        result[3][2] = 'w';
        result[3][3] = 'l';
        result[3][4] = 'l';
        result[3][5] = 'w';

        result[4][0] = 'w';
        result[4][1] = 'l';
        result[4][2] = 'w';
        result[4][3] = 'l';
        result[4][4] = 'l';
        result[4][5] = 'w';

        result[5][0] = 'w';
        result[5][1] = 'w';
        result[5][2] = 'w';
        result[5][3] = 'w';
        result[5][4] = 'w';
        result[5][5] = 'w';

        return result;
    }
}
