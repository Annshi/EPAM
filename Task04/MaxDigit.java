public class MaxDigit {
    public static int defineMax(int numb) {
        
        int max = getDigit(numb);//for max take last digit

        while (numb / 10 != 0) {
            int next = getDigit(numb = numb / 10);
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
