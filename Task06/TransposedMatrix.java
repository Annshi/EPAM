public class TransposedMatrix {
    public static void transposeMatrix(int[][] matrix) {
        
        for (int[] i : matrix) {
            if (matrix.length != i.length) {
                throw new IllegalArgumentException("Matrix isn't square");
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
            }
        }
    }
}
