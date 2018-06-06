public class MaxMin {
    public static final int MIN_ARRAY_LENGTH = 1;
    public static int findMax(int[] array) {
        if (array == null) {
        throw new NullPointerException();
        }

        if (array.length == MIN_ARRAY_LENGTH) {
            return array[0];
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length == 1) {
            return array[0];
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
