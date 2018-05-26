/*
 * @(#)DataTypesTester.java 1.3 26/05/18
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */
/**
 * The main class Main is the starting point of the program.
 *
 * @version          1.3 26 May 2018
 * @author           Shiman Anna
 */
public class Main {
    public static void main(String[] args) {

        //Checking on equality 3 variables
        int a = 5;
        int b = 6;
        int c = 5;
        System.out.printf("\nIs it true, that %d, %d, %d are all equal? --> %b\n", a, b, c,
                NumbersEquality.equalityCheck(a, b, c));

        //Converse dinosaur's weight in kg into ml, gr, tn
        double w = 500.42;
        System.out.printf("\nDinosaur's weight: %.2f kg = %.2f ml = %.2f gram = %.2f ton\n", w,
                DinosaurWeight.MillsConverse(w), DinosaurWeight.GramsConverse(w), DinosaurWeight.TonsConverse(w));

        //Calculating of ring's area, created by two circles
        double r1 = 18.42;
        double r2 = 15.15;
        System.out.printf("\nArea of ring, which is created by two circles = %.2f\n",
                RingArea.calculateArea(r1, r2));

        //Checking digits of number on sequense
        int ch = 9876;
        System.out.printf("\nIs it true, that digits of %d create sequence? --> %b\n", ch,
                Sequence.isSequence(ch));

        //Calculating of arithmetic and geometric average
        int numb = 739127;
        System.out.printf("\nGeometric and arithmetic average of digits %d equal as appropriate %s \n", numb,
                Average.calculateAverage(numb));

        //Making reversion of number
        int n = 7398713;
        System.out.printf("\nReversion of number %d equal %d \n", n,
                Reversion.reverseNumber(n));

        //Changing value of two variables
        int v1 = 3423;
        int v2 = 6666;
        System.out.printf("\n", ChangingValue.change(v1, v2), "\n");

    }
}