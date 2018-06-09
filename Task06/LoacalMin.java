public class LoacalMin {
    //1 option: with counting extreme elements
    public static int[] defineFirstLocalMin(int[][] array) {
        ArrayInitializer.validate(array);

        int col = array.length - 1;//length of col
        int row = array[0].length - 1;//length of row

        for (int i = 0; i <= col; i++) {
            for (int j = 0; j < row; j++) {
                //find first local min in the row
                if (array[i][j] < array[i][j + 1] || j == row - 1) {
                    if (j == row - 1 && array[i][row] < array[i][j]) {
                        j++;
                    }
                    // check if row's local min is also column's local min
                    if (i == 0 && array[i][j] < array[i + 1][j] //row is first, 1 neighbor in column
                            || i == col && array[i][j] < array[i - 1][j] //row is last, 1 neighbor in column 1
                            || array[i][j] < array[i + 1][j] && array[i][j] < array[i - 1][j]) {//other rows, 2 neighbor in column
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }

    //2 option: without counting extreme elements
    public static int[] defineFirstLocalMax(int[][] array) {
        ArrayInitializer.validate(array);

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i - 1][j] && array[i][j] > array[i][j + 1]
                        && array[i][j] > array[i + 1][j]
                        && array[i][j] > array[i][j - 1]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}