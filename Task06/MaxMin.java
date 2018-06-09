public class MaxMin {
    public static int findMax(int[][] array) {
        ArrayInitializer.validate(array);

        int max = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (max < j) {
                    max = j;
                }
            }
        }
        return max;
    }

    public static int findMin(int[][] array) {
        ArrayInitializer.validate(array);

        int min = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (min > j) {
                    min = j;
                }
            }
        }
        return min;
    }

}
