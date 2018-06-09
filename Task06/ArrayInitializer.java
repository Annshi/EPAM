import java.util.Random;

public class ArrayInitializer {

    public static void validate(int[][] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        if (array.length == 0 || array[0].length == 0) {
            System.out.println("Too small length of matrix");
        }
    }

    public static void initRandom(int[][] array, int min, int max){
        Random rand = new Random();
        for(int i = 0;i < array.length;i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }
}
