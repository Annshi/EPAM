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
public class Dragon {
    public static final int FIRST_AGE_BORDER = 200;//вкючительно
    public static final int SECOND_AGE_BORDER = 300;//вкючительно
    public static final int HEADS_BEFORE_200 = 3;
    public static final int HEADS_BETWEEN_200_300 = 2;
    public static final int HEADS_AFTER_300 = 1;

    public static String countHead(int age) {
        int heads = 3;
        if (age > SECOND_AGE_BORDER) {
            heads = countHead_After_300 (age);
        } else if(age > FIRST_AGE_BORDER){
           heads = countHead_Between_200_300(age);
        } else if (age < 0) {
            return "Wrong years value";
        } else heads = countHead_Before_200(age);

        int eyes = countEyes(heads);
        return "Dragon in the age of " + age + " has " + heads + " heads and " + eyes + " eyes.";
    }

    public static int countHead_Before_200 (int age){
        return (age+1)*HEADS_BEFORE_200;// age+1, because from born dragon has 3 heads
    }

    public static int countHead_Between_200_300 (int age){
        return countHead_Before_200(FIRST_AGE_BORDER)+((age-FIRST_AGE_BORDER)*HEADS_BETWEEN_200_300);
    }

    public static int countHead_After_300 (int age){
        return countHead_Between_200_300(SECOND_AGE_BORDER)+((age - SECOND_AGE_BORDER)*HEADS_AFTER_300);
    }

    public static int countEyes (int heads){
        return heads*2;
    }
}
