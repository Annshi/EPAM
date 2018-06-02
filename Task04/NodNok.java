/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class NodNok {

    //Euclid's algorithm
    public static int defineNOD(int a, int b) {

        return b != 0 ? defineNOD(b, a % b) : a;
    }

    //НОК(a, b)=a·b/НОД(a, b)
    public static int defineNOK(int a, int b) {

        return a*b/defineNOD(a, b);
    }
}
     /* NOD
     int max;
     int nod = 1;
     if (a > b) {
        max = b;
     } else max = a;

     for (int i = 1; i <= max; i++) {
        if (a % i == 0 & b % i == 0) {
        nod = i;
        }
     }
     return nod;
     */
