import java.util.Random;

public class ArrayInitializer {
    public static void initRandom(int[] arr, int min, int max) {
        if (arr == null) {
            throw new NullPointerException();
        }

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
    }
}

