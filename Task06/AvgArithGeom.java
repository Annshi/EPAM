import java.util.stream.Stream;

public class AvgArithGeom {
    public static double findAvgArith(int[][] array) {
        ArrayInitializer.validate(array);

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        return sum / (array.length * array[0].length);
    }

    public static double findAvgGeom(int[][] array) {
        ArrayInitializer.validate(array);

        double p = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) { //as avgGeom is calculated only for positive numbers
                    p = -1;
                    break;
                }
                p *= array[i][j];
            }
        }

        return Math.pow(p, 1. / (array.length * array[0].length));
    }
}

