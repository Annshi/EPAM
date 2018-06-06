/*
 * @(#)Main.java                  06.06 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. 
 *
 * @author Shiman Anna
 */
public class Main {
    public static void main(String args[]){

        int[] array = new int[];
        ArrayInitializer.initRandom(array, -10, 10);
        System.out.printf("Max number of array is %d", MaxMin.findMax(array));
        System.out.printf("\nMin number of array is %d", MaxMin.findMin(array));
        System.out.printf("\nIs array ordered? %b", OrderedArray.isOrdered(array));
        System.out.printf("\nFirst local min = %d", LocalMin.defineFirstLocalMin(array));
        System.out.printf("\nMassive after reverse is ", Reverse.makeReverse(array));
         for (int i : array) {
            sum+= i;
        }
        System.out.printf("\nAverage arithmetic is %f", ArithmGeom.calcAvgArith(array));
        System.out.printf("\nAverage geometric is %f", ArithmGeom.calcAvgGeom(array));
    }
}
