/*
 * @(#)ChangingValue.java      1.3 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class ChangingValue {
    public static String change(int v1, int v2) {
        v1 += v2;
        v2 = v1 - v2;
        v1 = v1 - v2;

        return ("First variable, initial value of which was " + v2 + "," + " now = " +v1 +
                ". Second variable, initial value of which was "+ v1 + "," + " now = " +v2);
    }
}
