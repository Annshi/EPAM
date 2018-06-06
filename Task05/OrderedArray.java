public class OrderedArray {
    public static boolean isOrdered(int[] array){

        return isIncreased(array) || isDecreased(array);
    }
    public static boolean isIncreased(int[] array){
        boolean res = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
            res = false;
            break;
            }
        }
        return res;
    }

    public static boolean isDecreased(int[] array){
        boolean res = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] < array[i+1]){
                res =  false;
                break;
            }
        }
        return res;
    }
}
