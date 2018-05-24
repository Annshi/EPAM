/*
 * @(#)Student.java      1.3 24/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved.
 */
public class Student {
    public String name;
    public double mark;
    /**
     * Creates a student with name and mark.
     *
     * @param name student's name
     * @param mark student's mark
     */
    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
    @Override
    public String toString() {
        return name + ": " + mark;
    }
}
