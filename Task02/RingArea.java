/*
 * @(#)calculateArea.java      1.3 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class RingArea {
    public static double calculateArea(double r1, double r2){

        return Math.PI*(Math.pow(r1, 2)- Math.pow(r2, 2));
    }
}

