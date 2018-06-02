/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class Palindrom {
        public static boolean isPalindrom(int numb) {
            String pal1 = String.valueOf(numb);
            String pal2 = String.valueOf(getDigit(numb));

            while (numb/10 != 0) {
                pal2+= getDigit(numb = numb / 10);
            }
            return (pal1.equals(pal2));
        }

        public static int getDigit (int numb){
            return numb % 10;
        }
    }
     /*  public static int isPalindrom(int numb) {
        int next = 0;
        int pal2 = numb;

        while (pal2 != 0)
        {
            next = (next * 10) + (pal2 % 10);
            pal2 /= 10;
        }

        if (numb == next)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }*/