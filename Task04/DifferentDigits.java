import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import javafx.util.converter.IntegerStringConverter;
/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class DifferentDigits {

   public static int countDif_outerLoop(int number) {
       int res = 0;
       int ch;
       int d1;
       int saveNum = number;
       while (number != 0) {
           d1 = number % 10;
           number /= 10;
           ch = 0;
           res+= countDif_innerLoop(saveNum, ch, d1);//counting amounts of unique digits in number
       }
       return res;
   }

       public static int countDif_innerLoop(int number, int ch, int d1){
           int d2;
           int amount = 0;
           int dif = 0;
           while(number != 0){
               amount++; //counting amounts of digits
               d2 = number % 10;
               number /= 10;
               if (d1 != d2){
                   ch++; //counting non-repeating times for digit
               }
           }
           if(ch == amount - 1){//length-1 by reason of comparison with itself
               dif = 1;// non-repeating times for digit = amounts of digits means that digit is unique
           }
           return dif ;
       }
   }

      /* public static int isDifferent() {
        String numb = "12245";

        char[] strToArray = numb.toCharArray();
        char[] sameNumb;
        int dif = 0;
        int ch = 0;
        int amount = strToArray.length;
        for (int i = 0; i < strToArray.length; i++) {
            ch = 0;
            for (int k = 0; k < strToArray.length; k++) {
                if (strToArray[i] != strToArray[k]) {
                   ch++;
                }
           }
           System.out.println(ch);
            if(ch==strToArray.length-1 ){
                dif++;
            }
        }
        return dif ;
    }*/