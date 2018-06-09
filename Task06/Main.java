import java.util.Arrays;

public class Main {
    public static void main(String args[]){

        //initialize matrix
        int [][] array = new int [4][5];
        ArrayInitializer.initRandom(array, 1, 12);

        //matrix
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // Local max, min
        System.out.println("FirstLocalMax " + java.util.Arrays.toString(LoacalMin.defineFirstLocalMax(array)));
        System.out.println("FirstLocalMin " + java.util.Arrays.toString(LoacalMin.defineFirstLocalMin(array)));

        //Max, min
        System.out.println("Max " + MaxMin.findMax(array));
        System.out.println("Min " + MaxMin.findMin(array));

        //Average
        System.out.println("Average arithmetic " + AvgArithGeom.findAvgArith(array));
        System.out.println("Average geometric " + AvgArithGeom.findAvgGeom(array));

        //Transposed matrix
        int [][] matrix = new int [5][5];
        ArrayInitializer.initRandom(matrix, 1, 12);
        System.out.println("\nMatrix before transpose");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("\nMatrix after transpose");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(transposeMatrix.transposeMatrix(matrix)[i]));
        }


    }
}
