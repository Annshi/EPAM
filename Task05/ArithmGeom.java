public class ArithmGeom {
    public static final int MIN_ARRAY_LENGTH = 1;
    public static double calcAvgArith(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length == MIN_ARRAY_LENGTH) {
            return array[0];
        }

        double sum = 0;
        for (int i : array) {
            sum+= i;
        }
        return  sum / array.length;
    }

    public static double calcAvgGeom(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length == MIN_ARRAY_LENGTH) {
            return array[0];
        }

        int max = array[0];

        double p = 1;
        for (int i : array) {
            if (i < 0) { //as avgGeom is calculated only for positive numbers
                p = -1;
                break;
            }
            p*= i;
        }
        return p!= -1 ? (Math.exp(Math.log(p) / array.length)) : p;
    }
}

