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
import static java.lang.Math.abs;
public class Triangle {
     public static final double ACCURACY_DOUBLE_COMPARISON = 0.00001;

    public static String isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double s1 = getSideLength(x1, y1, x2, y2);
        double s2 = getSideLength(x2, y2, x3, y3);
        double s3 = getSideLength(x3, y3, x1, y1);
        String result;

        if (isTriangle(s1, s2, s3)) {
            if (isRight(s1, s2, s3)) {
                result = "The points create right triangle";
            } else {
                result = "The points create triangle, but it isnt right";
            }
        } else {
            result = "The points aren't create triangle";
        }

        return result;
    }

    public static double getSideLength(double x_1, double y_1, double x_2, double y_2) {
        return Math.sqrt((y_2 - y_1) * (y_2 - y_1) + (x_2 - x_1) * (x_2 - x_1));
    }

    public static boolean isTriangle(double s1, double s2, double s3) {
        return ((s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2));
    }

    public static boolean isRight(double s1, double s2, double s3) {

        return ((abs(s1 * s1 + s2 * s2 - s3 * s3) < ACCURACY_DOUBLE_COMPARISON) ||
                (abs(s1 * s1 + s3 * s3 - s2 * s2) < ACCURACY_DOUBLE_COMPARISON) ||
                (abs(s2 * s2 + s3 * s3 - s1 * s1) < ACCURACY_DOUBLE_COMPARISON));

}}