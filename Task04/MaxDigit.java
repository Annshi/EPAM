/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class MaxDigit {
    public static int defineMax(int numb) {
        int next;
        int max = getDigit(numb);//for max take last digit

        while (numb / 10 != 0) {
            next = getDigit(numb = numb / 10);
            if (max < next) {
                max = next;
            }
        }
        return max;
    }

    public static int getDigit(int numb) {
        return numb % 10;
    }
}
