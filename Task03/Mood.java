/*
 * @(#)DataTypesTester.java 1.3 30/05/18
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */
/**
 *
 * @version          1.3 30 May 2018
 * @author           Shiman Anna
 */
public class Mood {
    public static final String HAPPY = ":)";
    public static final String APATHY ="\uD83D\uDE10";
    public static final String SAD = ":’(";
    public static final String DEATH= "not alive";
    public static final int ASSESS_FOR_SAD = 2;
    public static final int ASSESS_FOR_APATHY = 3;
    public static final int ASSESS_FOR_HAPPY = 4;
    public static final int ASSESS_FOR_DEATH = 0;


    public static String defineMood() {
        String mood;

        int assess = (int) (Math.random() * 5);

        if (assess <= ASSESS_FOR_SAD) {
            mood = SAD;
            if (assess == ASSESS_FOR_DEATH) {
                mood = DEATH;
            }
        } else if (assess == ASSESS_FOR_APATHY) {
            mood = APATHY;
        } else
            mood = HAPPY;

        return mood;
    }
}
