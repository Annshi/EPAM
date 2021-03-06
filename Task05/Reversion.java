public class Reversion {
    public static void makeReverse(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < array.length / 2; i++) {//:2 as change places only at once
            array[i] ^= array[array.length - 1 - i];//lending by pairs to the middle of array
            array[array.length - 1 - i] ^= array[i];
            array[i] ^= array[array.length - 1 - i];
        }
    }
}
