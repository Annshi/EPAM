/*
 * @(#)Sequence.java      1.3 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class Sequence {

    public static boolean isSequence(int ch){
        int first = (ch / 1000) % 10;
        int second = (ch / 100) % 10;
        int third = (ch / 10) % 10;
        int fourth = (ch % 10);

        return (first > second & second > third & third > fourth) || (first < second & second < third & third < fourth) ?  true : false;

   }
}
