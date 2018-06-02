/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class SimpleNumberDividers {
    public static boolean isSimple(int n) {
        if ((n % 2 == 0 || n < 2) && (n !=2)) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0 & n != i) {
                return false;
            }
        }
        return true;
    }

    public static String defineSimpleDividers(int n) {
        String dividers = "";
        if (n %2 == 0){
            dividers = "2";
        }
        for (int i = 3; i <= n; i = i + 2) {
            if (n % i == 0 & isSimple(i)) {
                    dividers+= " " + i;
                }
            }
        return dividers;
    }
}
