public class LocalMin {
    public static final int MIN_ELEMENTS = 2;
    //without counting extreme elements
    public static int defineFirstLocalMin(int[] array){
        int min = -1;//

        for(int i = 1; i < array.length - 1 && array.length > MIN_ELEMENTS; i++){
            if(array[i] < array[i+1]){
                if(i == 1 && array[i] > array[i-1]){
                    continue;
                }
                min = array[i];
                break;
            }
        }

        return min;
    }
}
      /* with counting extreme elements
        int min = -1;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] < array[i+1]){//&&i!=0
                min = array[i];
                break;
            }
            else if(i + 1 == array.length - 1 & array[array.length - 1]!= array[i]){
                min = array[array.length - 1];
                break;
            }
        }
        return min;
    }*/


