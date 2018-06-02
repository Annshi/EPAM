/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class PerfectNumber {
    public static boolean isPerfect(int numb){
        return calcSumDividers(numb) == numb;
    }

    public static int calcSumDividers(int numb){
        int sum = 0;
        for(int i = 1; i < numb; i++){
            if(numb % i == 0){
                sum+= i;
            }
        }
        return sum;
    }
}
