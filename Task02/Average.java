/*
 * @(#) Average.java      1.3 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class Average {
    public static String calculateAverage(int numb) {
        int ch1 = (numb/ 100000) % 10;
        int ch2  = (numb / 10000) % 10;
        int ch3  = (numb / 1000) % 10;
        int ch4  = (numb / 100) % 10;
        int ch5  = (numb / 10) % 10;
        int ch6  = numb % 10;

        double arithmetic = (ch1 + ch2 + ch3 + ch4 + ch5 + ch6) / 6.;
        double geometric = Math.pow(ch1 * ch2 * ch3 * ch4 * ch5 * ch6, 1./ 6.);

        return  arithmetic + ", " + geometric;
    }
}
