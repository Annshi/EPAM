/*
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */
/**
 * The main class Main is the starting point of the program.
 *
 * @version          1.3 30 May 2018
 * @author           Shiman Anna
 */
public class Main {
    public static final int HEADS_BEFORE200 = 3;
    public static final int HEADS_AFTER200 = 2;
    public static final int BORDER_FOR_200 = 200;
    public static final int BORDER_FOR_300 = 300;

    public static void main(String[] args) {

        double x1 = 1, y1 = 1;
        double x2 = 1, y2 = 3;
        double x3 = 4, y3 = 1;

        System.out.printf("%s", Triangle.isRightTriangle(x1, y1, x2, y2, x3, y3));

        int age = 102;
        System.out.printf("\n%s", Dragon.countHead(age));

        char ch = 'a';
        System.out.printf("\n%b", Vowel.isVowel_5(ch));

        System.out.printf("\n%s", Mood.defineMood());

        int currentDay = 31;
        int currentMonth = 12;
        int currentYear = 2018;
        System.out.printf("\n%s", Calendar.defineNextDate(currentDay, currentMonth, currentYear));
    }
}
