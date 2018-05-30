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
public class Vowel {
    public final static String STRING_OF_VOWEL = "eyuioaEYUIOA";

    public static boolean isVowel_1(char ch) {
        if (ch == 'a' || ch == 'A') {
            return true;
        } else if (ch == 'y' || ch == 'Y') {
            return true;
        } else if (ch == 'u' || ch == 'U') {
            return true;
        } else if (ch == 'i' || ch == 'I') {
            return true;
        } else if (ch == 'o' || ch == 'O') {
            return true;
        } else if (ch == 'e' || ch == 'E') {
            return true;
        }
        return false;
    }


    public static boolean isVowel_2(char ch) {

        return (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U');
    }

    public static boolean isVowel_3(char ch) {
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'U':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static boolean isVowel_4(char ch) {
            return STRING_OF_VOWEL.contains(Character.toString(ch));
   }

    public static boolean isVowel_5(char ch) {
        for(int i=0; i< STRING_OF_VOWEL.length();i++)
        {
            if(ch == STRING_OF_VOWEL.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}