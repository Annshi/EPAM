/*
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */
/**
 * The main class Main is the starting point of the program.
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class Main {
    public static void main(String[] args){

        int tossAmount = 1000;
        System.out.println(Coin.countSides(tossAmount));

        int num = 12341;
        System.out.printf( "\nMax digit of %d is %d ", num,  MaxDigit.defineMax(num));
        System.out.printf( "\nIs %d palindrom? %b ", num, Palindrom.isPalindrom(num));
        System.out.printf( "\nIs perfect? %b", PerfectNumber.isPerfect(num));

        int n = 7;
        System.out.printf( "\nIs %d simple? %b", n, SimpleNumberDividers.isSimple(n));
        System.out.printf( "\nSimple dividers %s", SimpleNumberDividers.defineSimpleDividers(n));

        int a = 48;
        int b = 36;
        System.out.printf( "\n NOD = %d, NOK = %d\n", NodNok.defineNOD(a, b), NodNok.defineNOK(a, b));

        System.out.printf( "\nHow many different? %d ", DifferentDigits.countDif_outerLoop(num));



    }

}
