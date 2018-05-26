/*
 * @(#)DinosaurWeight.java      1.3 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class DinosaurWeight{
    public static final int CONVERT_TO_MILLIS = 1_000_000;
    public static final int CONVERT_TO_GRAMS = 1_000;
    public static final double CONVERT_TO_TONS = 0.001;

    public static double MillsConverse(double kg){
        return kg*CONVERT_TO_MILLIS;
    }

    public static double GramsConverse(double kg){
        return kg*CONVERT_TO_GRAMS;
    }

    public static double TonsConverse(double kg){
        return kg*CONVERT_TO_TONS;
    }
}
