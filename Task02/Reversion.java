/*
 * @(#)Reversion.java      1.3 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class Reversion {
    public static int reverseNumber(int n) {
        int ch1 = (n / 1000000) % 10;
        int ch2 = (n / 100000) % 10;
        int ch3  = (n / 10000) % 10;
        int ch4  = (n / 1000) % 10;
        int ch5  = (n / 100) % 10;
        int ch6  = (n / 10) % 10;
        int ch7  = n % 10;

        return (ch7*1000000 + ch6*100000 + ch5 *10000 + ch4*1000 + ch3*100 + ch2*10 + ch1);
    }
}
