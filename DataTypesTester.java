/*
 * @(#)DataTypesTester.java 1.3 24/05/18
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */

/**
 * Class DataTypesTester is created for testing operations with all primitive
 * and two reference types(String, Student).
 *
 * @version          1.3 24 May 2018
 * @author           Shiman Anna
 */

public class DataTypesTester {
    /* Testing byte type. */
    public static void testByte(){
        byte a = 54;
        byte b = 2;
        byte c;

        System.out.println("----------- Arithmetical operations(Byte) -----------");
        // addition
        c = (byte)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = (byte)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = (byte)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        //devision
        c = (byte)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulo
        c = (byte)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        //unary minus
        a = 12;
        c = (byte)-a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (byte)+a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 12;
        System.out.printf("++%d = %d\n", a, ++a);
        System.out.printf("%d\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 12;
        System.out.printf("%d++ = %d\n", a, a++);
        System.out.printf("%d\n", a);
        //prefix decrement
        a = 12;
        System.out.printf("prefix decrement: ");
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.printf("%d\n", a);
        //postfix decrement
        a = 12;
        System.out.printf("postfix decrement: ");
        System.out.printf("--%d = %d\n", a, --a);
        System.out.printf("%d\n", a);

        System.out.println("\n------------ Bitwise Operators(Byte) ----------------");
        a = 5;
        b = 4;
        // bitwise AND
        c =(byte) ( a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = (byte) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = (byte) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = (byte) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        a = 5;
        c = (byte) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for positive
        a = 5;
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // zero fill right shift for positive
        a = 5;
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for negative
        a = -5;
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // !!!!!!!! zero fill right shift(unsigned) for negative work as >> for byte, because of cutting !!!!!!!!
        a = -5;
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n-------------- Assignment Operators(Byte) ------------------");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        c = 6;
        a = -5;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        //How |= a works on binary level
        c = 6;
        a = -5;
        System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString(c), Integer.toBinaryString(a), Integer.toBinaryString(c |= a));
        c = 6;
        a = 2;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        //How &= a works on binary level
        c = 6;
        a = 2;
        System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString(c), Integer.toBinaryString(a), Integer.toBinaryString(c &= a));
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = -8;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        c = -8;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n --------- Relational Operators(Byte) ----------------");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations(Byte) --------------");
        // logical OR || shortcut: the first is true - the second isnt checked
        byte number = 10;
        if ((number != 0) || (number = 12) > -1) {
            System.out.printf("(number != 0) || (number = 12) > -1)--> number = %d\n", number);
        }
        // bitwise logical OR | both are checked
        number = 10;
        if ((number != 0) | (number = 12) > -1) {
            System.out.printf("(number != 0) | (number = 12) > -1 --> number = %d\n", number);
        }
        // logical & AND, first is false - second isnt checked
        number = 10;
        if (!((number != 10) && (number = 12) > -1)) {
            System.out.printf("!((number != 0) && (number = 12) > -1) --> number = %d\n", number);
        }
        // bitwise logical & AND, both are checked
        number = 10;
        if (!((number != 10) & (number = 12) > -1)) {
            System.out.printf("!((number != 0) & (number = 12) > -1) --> number = %d\n", number);
        }
        // logical XOR, there is no shortcut ^^, as 2-0 and 2-1
        System.out.printf("(%d <= %d) ^ (%d != -2) --> %b\n", a, b, b, (a <= b) ^ (b != -2));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n-------- Misc Operators(Byte) -------------");

        System.out.println("\nCondition Operator(Byte):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator(Byte):");
        byte by;//-128...127 - byte
        int in = 301;
        short sh = -32768;
        char ch = 65533;
        long l = 2147483649L ;
        float f = 21474.23f;
        double d = 2147483647.12;
        String str = "line";
        Student stud = new Student("Kate Frolova", 3);
        boolean bool = true;
        by = (byte)in;//-128...127, narrowing of types, -129 -->127, 130 -->-126, 128-->-128
        System.out.printf("byte = int: by = (byte)%d --> by = %d\n", in, by);
        //How byte = int works on binary level
        System.out.printf("byte = int: by = (byte)%s --> by = %s\n", Integer.toBinaryString(in), Integer.toBinaryString(by));
        by = (byte)sh;
        System.out.printf("byte = short: by = (byte)%d --> in = %d\n", sh, by);//-32768...32767 - short
        //How byte = short works on binary level
        System.out.printf("byte = short: by = (byte)%s --> by = %s\n", Integer.toBinaryString(sh), Integer.toBinaryString(by));
        by = (byte)ch;
        System.out.printf("byte = char: by = (byte) %c --> by = %d\n", ch, by);//0...65536 - char
        //How byte = char works on binary level
        System.out.printf("byte = char: by = (byte)%s --> by = %s\n", Integer.toBinaryString(ch), Integer.toBinaryString(by));
        by = (byte)l;
        System.out.printf("byte = long: by = (byte)%d --> by = %d\n", l, by);//-9223372036854775808...9223372036854775807 - long
        //How byte = long works on binary level
        System.out.printf("byte = long: by = (byte)%s --> by = %s\n", Long.toBinaryString(l), Integer.toBinaryString(by));
        by = (byte) f;
        System.out.printf("byte = float: by = (byte)%f --> by = %d\n", f, by); //-3.4*10^38...3.4*10^38 - float
        by = (byte) d;
        System.out.printf("byte = double: by = (byte)%e --> by = %d\n", d, by);//-1.7E+308...1.7E+308 - double
        //by = (byte) bool;
        System.out.printf("byte = boolean: by = (byte)%b --> Compile Error\n", bool);
        //by = (byte) str;
        System.out.printf("byte = String: by = (byte)%s --> Compile Error\n", str);
        //by = (byte) stud;
        System.out.printf("byte = Student: by = (byte)%s--> Compile Error\n", stud);
    }
    /* Testing short type. */
    public static void testShort() {
        short a = 4385;
        short b = 1665;
        short c;

        System.out.println("\n----------- Arithmetical operations(Short) -----------");
        // addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        //devision
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulo
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //unary minus
        a = 13422;
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 13422;
        System.out.printf("++%d = %d\n", a, ++a);
        System.out.printf("%d\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 13422;
        System.out.printf("%d++ = %d\n", a, a++);
        System.out.printf("%d\n", a);
        //prefix decrement
        a = 13422;
        System.out.printf("prefix decrement: ");
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.printf("%d\n", a);
        //postfix decrement
        a = 13422;
        System.out.printf("postfix decrement: ");
        System.out.printf("--%d = %d\n", a, --a);
        System.out.printf("%d\n", a);

        System.out.println("\n------------ Bitwise Operators(Short) ----------------");
        a = 5487;
        b = 423;
        // bitwise AND
        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = (short) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = (short) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = (short) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        a = 5384;
        c = (short) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for positive
        a = 5384;
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // zero fill right shift for positive
        a = 5384;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for negative
        a = -5384;
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // !!!!!!!! zero fill right shift(unsigned) for negative work as >> for short because of cutting !!!!!!!!
        a = -5384;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n-------------- Assignment Operators(Short) ------------------");
        c = 124;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        c = 124;
        a = -5435;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        //How |= a works on binary level
        c = 124;
        a = -5435;
        System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString(c), Integer.toBinaryString(a), Integer.toBinaryString(c |= a));
        c = 124;
        a = 268;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        //How &= a works on binary level
        c = 124;
        a = 268;
        System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString(c), Integer.toBinaryString(a), Integer.toBinaryString(c &= a));
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = -863;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        c = -863;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n --------- Relational Operators(Short) ----------------");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations(Short) --------------");
        // logical OR || shortcut: the first is true - the second isnt checked
        short number = 10000;
        if ((number != 0) || (number = 12) > -1) {
            System.out.printf("(number != 0) || (number = 12) > -1)--> number = %d\n", number);
        }
        // bitwise logical OR | both are checked
        number = 10000;
        if ((number != 0) | (number = 12) > -1) {
            System.out.printf("(number != 0) | (number = 12) > -1 --> number = %d\n", number);
        }
        // logical & AND, first is false - second isnt checked
        number = 10000;
        if (!((number != 10000) && (number = 12) > -1)) {
            System.out.printf("!((number != 0) && (number = 12) > -1) --> number = %d\n", number);
        }
        // bitwise logical & AND, both are checked
        number = 10000;
        if (!((number != 10000) & (number = 12) > -1)) {
            System.out.printf("!((number != 0) & (number = 12) > -1) --> number = %d\n", number);
        }
        // logical XOR, there is no shortcut ^^, as 2-0 and 2-1
        System.out.printf("(%d <= %d) ^ (%d != -2) --> %b\n", a, b, b, (a <= b) ^ (b != -2));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n-------- Misc Operators(Short) -------------");

        System.out.println("\nCondition Operator(Short):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator(Short):");

        short sh;//-32768...32767 - short
        byte by = 45;
        int in = 30184934;
        char ch = 65533;
        long l = 2147483649L;
        float f = 21474.23f;
        double d = 2147483647.12;
        boolean bool = true;
        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);
        sh = by;
        System.out.printf("sh = byte: sh = %d --> sh = %d\n", by, sh);
        System.out.printf("sh = byte: sh = (short)%s --> sh = %s\n", Integer.toBinaryString(by), Integer.toBinaryString(sh));
        sh = (short) in;
        System.out.printf("sh = int: sh = (short)%d --> sh = %d\n", in, sh);
        System.out.printf("sh = int: sh = (short)%s --> sh = %s\n", Integer.toBinaryString(in), Integer.toBinaryString(sh));
        sh = (short) ch;
        System.out.printf("sh = char: sh = (short) %c --> sh = %d\n", ch, sh);//0...65536 - char
        sh = (short) l;
        System.out.printf("sh = long: sh = (short)%d --> sh = %d\n", l, sh);//-9223372036854775808...9223372036854775807 - lon
        sh = (short) f;
        System.out.printf("sh = float: sh = (short)%f --> sh = %d\n", f, sh); //-3.4*10^38...3.4*10^38 - float
        sh = (short) d;
        System.out.printf("sh = double: sh = (short)%e --> sh = %d\n", d, sh);//-1.7E+308...1.7E+308 - double
        //sh = (short) bool;
        System.out.printf("sh = boolean: sh = (short)%b --> Compile Error\n", bool);
        //sh = (short) str;
        //sh = (short) str;
        System.out.printf("sh = String: sh = (short)%s --> Compile Error\n", str);
        //sh = (short) stud;
        System.out.printf("sh = Student: sh = (short)%s --> Compile Error\n", stud);
    }
    /* Testing char type. */
    public static void testChar(){
        char a = '\u0102';
        char b = '\u0101';
        char c;

        System.out.println("\n----------- Arithmetical operations(Char) -----------");
        // addition
        c = (char)(a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        //subtraction
        c = (char)(a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);
        //multiplication
        c = (char)(a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
        //devision
        c = (char)(a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
        //modulo
        c = (char)(a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        //unary minus
        a = 'q';
        c = (char)-a;
        System.out.printf("-%c = %c\n", a, c);
        //unary plus
        c = (char)+a;
        System.out.printf("+%c = %c\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 'q';
        System.out.printf("++%c = %c\n", a, ++a);
        System.out.printf("%c\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 'q';
        System.out.printf("%c++ = %c\n", a, a++);
        System.out.printf("%c\n", a);
        //prefix decrement
        a = 'q';
        System.out.printf("prefix decrement: ");
        System.out.printf("%c-- = %c\n", a, a--);
        System.out.printf("%c\n", a);
        //postfix decrement
        a = 'q';
        System.out.printf("postfix decrement: ");
        System.out.printf("--%c = %c\n", a, --a);
        System.out.printf("%c\n", a);

        System.out.println("\n------------ Bitwise Operators(Char) ----------------");
        a = 'g';
        b = 'a';
        // bitwise AND
        c =(char) ( a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = (char) (a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = (char) (a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = (char) ~a;
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        a = '\123';
        c = (char) (a << 1);
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for positive
        a = '\123';
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // zero fill right shift for positive
        a = '\123';
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for negative
        a = '\321';
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // !!!!!!!! zero fill right shift(unsigned) for negative work as >> for byte because of cutting !!!!!!!!
        a = '\321';
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n --------- Relational Operators(Char) ----------------");
        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations(Char) --------------");
        // bitwise logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n-------- Misc Operators(Char) -------------");
        System.out.println("\nCondition Operator(Char):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator(Char):");
        char ch;
        byte by = 127;
        int in = 301;
        short sh = -32768;
        long l = 2147483649L ;
        float f = 21474.23f;
        double d = 2147483647.12;
        boolean bool = true;
        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);
        ch = (char)by;//0...65536 - char
        System.out.printf("char = byte: ch = (char)%d --> ch = %c\n", by, ch);
        System.out.printf("char = byte: ch = (char)%s --> ch = %s\n", Integer.toBinaryString(by), Integer.toBinaryString(ch));
        ch = (char)sh;
        System.out.printf("char = short: ch= (char)%d --> ch = %c\n", sh, ch);//-32768...32767 - short
        System.out.printf("char = short: ch= (char)%s --> ch = %s\n", Integer.toBinaryString(sh), Integer.toBinaryString(ch));
        ch = (char)in;
        System.out.printf("char = int: ch = (char) %d --> ch = %c\n", in, ch);
        System.out.printf("char = int: ch = (char)%s --> ch = %s\n", Integer.toBinaryString(in), Integer.toBinaryString(ch));
        ch = (char)l;
        System.out.printf("char = long: ch = (char)%d --> ch = %c\n", l, ch);//-9223372036854775808...9223372036854775807 - long
        System.out.printf("char = long: ch = (char)%s --> ch = %s\n", Long.toBinaryString(l), Integer.toBinaryString(ch));
        ch = (char) f;
        System.out.printf("char = float: ch = (char)%f --> ch = %c\n", f, ch); //-3.4*10^38...3.4*10^38 - float
        ch = (char) d;
        System.out.printf("char = double: ch = (char)%e --> ch = %c\n", d, ch);//-1.7E+308...1.7E+308 - double
        //ch = (char) bool;
        System.out.printf("char = boolean: ch = (char)%b --> Compile Error\n", bool);
        //ch = (char) str;
        System.out.printf("char = String: ch = (char)%s --> Compile Error\n", str);
        //ch = (char) stud;
        System.out.printf("char = Student: ch = (char)%s --> Compile Error\n", stud);
    }
    /* Testing int type. */
    public static void testInt() {
        int a = 5;
        int b = 2;
        int c;

        System.out.println("\n----------- Arithmetical operations(Int) -----------");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //devision
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulo
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        //unary minus
        a = 5;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        System.out.printf("%d\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        System.out.printf("%d\n", a);
        //prefix decrement
        a = 5;
        System.out.printf("prefix decrement: ");
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.printf("%d\n", a);
        //postfix decrement
        a = 5;
        System.out.printf("postfix decrement: ");
        System.out.printf("--%d = %d\n", a, --a);
        System.out.printf("%d\n", a);

        System.out.println("\n------------ Bitwise Operators(Int) ----------------");
        a = 5;
        b = 4;
        // bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        a = 5;
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for positive
        a = 5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // zero fill right shift for positive
        a = 5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // right shift for negative
        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // zero fill right shift for negative без учета знака
        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n-------------- Assignment Operators(Int) ------------------");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        c = 6;
        a = -5;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        //How |= a works on binary level
        c = 6;
        a = -5;
        System.out.printf("%s |= %s --> c = %s\n", Integer.toBinaryString(c), Integer.toBinaryString(a), Integer.toBinaryString(c |= a));
        c = 6;
        a = 2;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        //How &= a works on binary level
        c = 6;
        a = 2;
        System.out.printf("%s &= %s --> c = %s\n", Integer.toBinaryString(c), Integer.toBinaryString(a), Integer.toBinaryString(c &= a));
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n --------- Relational Operators(Int) ----------------");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations(Int) --------------");
        // logical OR || shortcut: the first is true - the second isnt checked, is used only with boolean types
        int number=10;
        if ((number != 0) || (number = 12) > -1) {
            System.out.printf("(number != 0) || (number = 12) > -1)--> number = %d\n", number);
        }
        boolean t= true;
        boolean i = false;
        boolean p;
        p=t||i;
        System.out.printf("%b || %b --> %b\n", t, i, p);
        // bitwise logical OR | both are checked, could use with int
        number = 10;
        if ((number != 0) | (number = 12) > -1) {
            System.out.printf("(number != 0) | (number = 12) > -1 --> number = %d\n", number);
            int k, s=10, f=4;
            k=s&f;
            System.out.printf("%d | %d --> %d\n", s, f, k);
        }
        // logical & AND, first is false - second isnt checked, , is used only with boolean types
        number = 10;
        if (!((number != 10) && (number = 12) > -1)) {
            System.out.printf("!((number != 0) && (number = 12) > -1) --> number = %d\n", number);
        }
        // bitwise logical & AND, both are checked, could use with int
        number = 10;
        if (!((number != 10) & (number = 12) > -1)) {
            System.out.printf("!((number != 0) & (number = 12) > -1) --> number = %d\n", number);
        }
        int k, s=10, z=8;
        k=s&z;
        System.out.printf("%d | %d --> %d\n", s, z, k);
        // logical XOR, there is no shortcut ^^, as 2-0 and 2-1
        System.out.printf("(%d <= %d) ^ (%d != -2) --> %b\n", a, b, b, (a <= b) ^ (b != -2));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n-------- Misc Operators(Int) -------------");

        System.out.println("\nCondition Operator(Int):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator(Int):");
        int in =128;
        int x;
        byte bt = 120;
        short sh = -32768;
        char ch = 65533;
        long l = 2147483648483433L ;
        float f = 21474.23f;
        double d = 2147483647.12;
        boolean bool = true;

        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);
        in = bt;
        System.out.printf("int = byte: in = %d --> in = %d\n", bt, in);//-128...127 - byte
        in = sh;
        System.out.printf("int = short: in = %d --> in = %d\n", sh, in);//-32768...32767 - short
        in = ch;
        System.out.printf("int = char: in = %c --> in = %d\n", ch, in);//0...65536 - char
        in = (int) l;//-2147483648...2147483647 - int
        System.out.printf("int = long: in = (int)%d --> in = %d\n", l, in);//-9223372036854775808...9223372036854775807 - long
        in = (int) f;
        System.out.printf("int = float: in = (int)%f --> in = %d\n", f, in); //-3.4*10^38...3.4*10^38 - float
        in = (int) d;
        System.out.printf("int = double: in = (int)%e --> in = %d\n", d, in);//-1.7E+308...1.7E+308 - double
        //in = (int) bool;
        System.out.printf("int = boolean: in = (int)%b --> Compile Error\n", bool);
        //in = (int) str;
        System.out.printf("int = String: in = (int)%s --> Compile Error\n", str);
        //in = (int) stud;
        System.out.printf("int = Student: in = (int)%s --> Compile Error\n", stud);
    }
    /* Testing long type. */
    public static void testLong(){
        long a = 5458724534546L;
        long b = 295739395L;
        long c;

        System.out.println("\n----------- Arithmetical operations(Long) -----------");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //devision
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulo
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        //unary minus
        a = 453855305L;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 453855305L;
        System.out.printf("++%d = %d\n", a, ++a);
        System.out.printf("%d\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 453855305L;;
        System.out.printf("%d++ = %d\n", a, a++);
        System.out.printf("%d\n", a);
        //prefix decrement
        a = 453855305L;;
        System.out.printf("prefix decrement: ");
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.printf("%d\n", a);
        //postfix decrement
        a = 453855305L;
        System.out.printf("postfix decrement: ");
        System.out.printf("--%d = %d\n", a, --a);
        System.out.printf("%d\n", a);

        System.out.println("\n------------ Bitwise Operators(Long) ----------------");
        a = 453855305L;
        b = 44584353458L;
        // bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        // bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        // left shift
        a = 453855305L;
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        // right shift for positive
        a = 453855305L;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        // zero fill right shift for positive
        a = 453855305L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        // right shift for negative
        a = -453855305L;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        // zero fill right shift for negative без учета знака
        a = -453855305L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        System.out.println("\n-------------- Assignment Operators(Long) ------------------");
        c = 734353L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        c = 645295354395L;
        a = -522713283233482394L;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        //How |= a works on binary level
        c = 645295354395L;
        a = -522713283233482394L;
        System.out.printf("%s |= %s --> c = %s\n", Long.toBinaryString(c), Long.toBinaryString(a), Long.toBinaryString(c |= a));
        c = 645295354395L;
        a = 522713283233482394L;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        //How &= a works on binary level
        c = 645295354395L;
        a = 522713283233482394L;
        System.out.printf("%s &= %s --> c = %s\n", Long.toBinaryString(c), Long.toBinaryString(a), Long.toBinaryString(c &= a));
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n --------- Relational Operators(Long) ----------------");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations(Long) --------------");
        // logical OR || shortcut: the first is true - the second isnt checked
        long number = 18942840L;
        if ((number != 0) || (number = 123433354L) > -1) {
            System.out.printf("(number != 0) || (number = 123433354L) > -1)--> number = %d\n", number);
        }
        // bitwise logical OR | both are checked
        number = 18942840L;
        if ((number != 0) | (number = 123433354L) > -1) {
            System.out.printf("(number != 0) | (number = 123433354L) > -1 --> number = %d\n", number);
        }
        // logical & AND, first is false - second isnt checked
        number = 18942840L;;
        if (!((number != 18942840L) && (number = 123433354L) > -1)) {
            System.out.printf("!((number != 18942840L) && (number = 123433354L) > -1) --> number = %d\n", number);
        }
        // bitwise logical & AND, both are checked, could use with int
        number = 18942840L;
        if (!((number != 18942840L) & (number = 123433354L) > -1)) {
            System.out.printf("!((number != 18942840L) & (number = 123433354L) > -1) --> number = %d\n", number);
        }
        // logical XOR, there is no shortcut ^^, as 2-0 and 2-1
        System.out.printf("(%d <= %d) ^ (%d != -2) --> %b\n", a, b, b, (a <= b) ^ (b != -2));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n-------- Misc Operators(Long) -------------");

        System.out.println("\nCondition Operator(Long):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator(Long):");
        long l;//-9223372036854775808...9223372036854775807 - long
        int in = 128234335;
        byte bt = 120;
        short sh = -32768;
        char ch = 65533;
        float f = 21474.23f;
        double d = 2147483647.12;
        boolean bool = true;
        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);
        l = bt;
        System.out.printf("Long = byte: l = %d --> l = %d\n", bt, l);//-128...127 - byte
        l = sh;
        System.out.printf("Long = short: l = %d --> l = %d\n", sh, l);//-32768...32767 - short
        l = ch;
        System.out.printf("Long = char: l = %c --> l = %d\n", ch, l);//0...65536 - char
        l = in;//-2147483648...2147483647 - int
        System.out.printf("Long = int: l = %d --> l = %d\n", in, l);//-2147483648...2147483647 - int
        l = (long)f;
        System.out.printf("Long = float: l = (long)%f --> l = %d\n", f, l); //-3.4*10^38...3.4*10^38 - float
        l = (long)d;
        System.out.printf("Long = double: l = (long)%e --> l = %d\n", d, l);//-1.7E+308...1.7E+308 - double
        //l = (long) bool;
        System.out.printf("Long = boolean: l = (long)%b --> Compile Error\n", bool);
        //l = (long) str;
        System.out.printf("Long = String: l = (long)%s --> Compile Error\n", str);
        //l = (long) stud;
        System.out.printf("Long = Student: l = (long)%s --> Compile Error\n", stud);
    }
    /* Testing float type. */
    public static void testFloat(){
        float a = 632.4255f;
        float b = 321.4583f;
        float c;

        System.out.println("\n------------- Arithmetical Operators(Float) -------------");
        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        //devision
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        //modulo
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        //unary minus
        a = 11243.12f;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 11243.12f;
        System.out.printf("++%f = %f\n", a, ++a);
        System.out.printf("%f\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 11243.12f;
        System.out.printf("%f++ = %f\n", a, a++);
        System.out.printf("%f\n", a);
        //prefix decrement
        a = 11243.12f;
        System.out.printf("prefix decrement: ");
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.printf("%f\n", a);
        //postfix decrement
        a = 11243.12f;
        System.out.printf("postfix decrement: ");
        System.out.printf("--%f = %f\n", a, --a);
        System.out.printf("%f\n", a);

        System.out.println("\n------------ Bitwise Operators(Float) ----------------");
        System.out.println("Bitwise operators aren't used with float type");

        System.out.println("\n-------------- Assignment Operators(Float) ------------------");
        a = 14323.152f;
        c = 21233.231f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        System.out.println("Assignment operators &=, ^=, >>=, >>>=, <<=  are not allowed to use with float");

        System.out.println("\n------- Relational Operators(Float) ---------");
        a = 562322.31f;
        b = 1253225.34f;
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations(Float) --------------");
        // logical OR || shortcut
        float number = 657.028f;
        if ((number != 1.1) || (number = 12.434f) > -1) {
            System.out.printf("(number != 0) || (number = 12.434f) > -1)--> number = %f\n", number);
        }
        // bitwise logical OR
        number = 657.028f;
        if ((number != 1.1) | (number = 12.434f) > -1) {
            System.out.printf("(number != 0) | (number = 12.434f) > -1 --> number = %f\n", number);
        }
        // logical && AND shortcut
        number = 657.028f;
        if (!((number != 657.028f) && (number = 12.434f) > -1)) {
            System.out.printf("!((number != 10.643f) && (number = 12.434f) > -1) --> number = %f\n", number);
        }
        // bitwise logical & AND
        number = 657.028f;
        if (!((number != 657.028f) & (number = 12.434f) > -1)) {
            System.out.printf("!((number != 657.028f) & (number = 12.434f) > -1) --> number = %f\n", number);
        }
        // logical XOR, there is no shortcut ^^, as 2-0 and 2-1
        System.out.printf("(%f <= %f) ^ (%f != -2) --> %b\n", a, b, b, (a <= b) ^ (b != -6.3));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n-------- Misc Operators(Float) -------------");

        System.out.println("\nCondition Operator(Float):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator(Float):");
        float f;
        double d = 4984389544445438.433;
        int in =2147483647;
        byte bt = 127;
        short sh = -32768;
        char ch = 65533;
        long l = 9223372036854775807L ;
        boolean bool = true;
        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);

        f = bt;//-3.4*10^38...3.4*10^38 - float
        System.out.printf("float = byte: f = %d --> f = %f\n", bt, f);//-128...127 - byte
        f = sh;
        System.out.printf("float = short: f = %d --> f = %f\n", sh, f);//-32768...32767 - short
        f = ch;
        System.out.printf("float = char: f = %c --> f = %f\n", ch, f);//0...65536 - char
        f = in;
        System.out.printf("float = int: f = %d --> f = %f\n", in, f);//-2147483648...2147483647 - int
        f = l;
        System.out.printf("float = long: f = %d --> f = %f\n", l, f);//-9223372036854775808...9223372036854775807 - long ????????????
        f = (float)d;
        System.out.printf("float = double: f = (float)%e --> f = %f\n", d, f);//-1.7E+308...1.7E+308 - double
        //f = (float) bool;
        System.out.printf("float = boolean: f = (float)%b --> Compile Error\n", bool);
        //f = (float) str;
        System.out.printf("float = String: f = (float)%s --> Compile Error\n", str);
        //f = (float) stud;
        System.out.printf("float = Student: f = (float)%s --> Compile Error\n", stud);
    }
    /* Testing double type. */
    public static void testDouble(){
        double a = 541.54;
        double b = 213.12;
        double c;

        System.out.println("\n------------- Arithmetical Operators(Double) -------------");
        //addition
        c = a + b;
        System.out.printf("%e + %e = %e\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%e - %e = %e\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%e * %e = %e\n", a, b, c);
        //devision
        c = a / b;
        System.out.printf("%e / %e = %e\n", a, b, c);
        //modulo
        c = a % b;
        System.out.printf("%e %% %e = %e\n", a, b, c);
        //unary minus
        a = 143.12;
        c = -a;
        System.out.printf("-%e = %e\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%e = %e\n", a, c);
        // prefix increment
        System.out.printf("prefix increment: ");
        a = 143.12;
        System.out.printf("++%e = %e\n", a, ++a);
        System.out.printf("%e\n", a);
        // postfix increment
        System.out.printf("postfix increment: ");
        a = 143.12;
        System.out.printf("%e++ = %e\n", a, a++);
        System.out.printf("%e\n", a);
        //prefix decrement
        a = 143.12;
        System.out.printf("prefix decrement: ");
        System.out.printf("%e-- = %e\n", a, a--);
        System.out.printf("%e\n", a);
        //postfix decrement
        a = 143.12;
        System.out.printf("postfix decrement: ");
        System.out.printf("--%e = %e\n", a, --a);
        System.out.printf("%e\n", a);

        System.out.println("\n------------ Bitwise Operators(Double) ----------------");
        System.out.println("Bitwise operators arenot used with double type");

        System.out.println("-------------- Assignment Operators(Double) ------------------");
        a = 143.12;
        c = 213.21;
        System.out.printf("%e += %e --> c = %e\n", c, a, c += a);
        System.out.printf("%e -= %e --> c = %e\n", c, a, c -= a);
        System.out.printf("%e *= %e --> c = %e\n", c, a, c *= a);
        System.out.printf("%e /= %e --> c = %e\n", c, a, c /= a);
        System.out.printf("%e %%= %e --> c = %e\n", c, a, c %= a);
        System.out.println("Assignment operators &=, ^=, >>=, >>>=, <<=  are not allowed to use with double\n");

        System.out.println("------- Relational Operators(Double) ---------");
        a=2322.31;
        b=53225.34;
        // greater than
        System.out.printf("%e > %e --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%e >= %e --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%e < %e --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%e <= %e --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%e == %e --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%e != %e --> %b\n", a, b, a != b);

        System.out.println("\n----------- Logical Operations --------------");
        // logical OR || shortcut
        double number = 10.534;
        if ((number != 1.1) || (number = 12.434) > -1) {
            System.out.printf("(number != 0) || (number = 12.434) > -1)--> number = %e\n", number);
        }
        // bitwise logical OR
        number = 10.643;
        if ((number != 1.1) | (number = 12.434) > -1) {
            System.out.printf("(number != 0) | (number = 12.434) > -1 --> number = %e\n", number);
        }
        // logical && AND shortcut
        number = 10.643;
        if (!((number != 10.643) && (number = 12.434) > -1)) {
            System.out.printf("!((number != 10.643) && (number = 12.434) > -1) --> number = %e\n", number);
        }
        // bitwise logical & AND
        number = 10.643;
        if (!((number != 10.643) & (number = 12.434) > -1)) {
            System.out.printf("!((number != 10.643) & (number = 12.434) > -1) --> number = %e\n", number);
        }
        // logical XOR, there is no shortcut ^^, as 2-0 and 2-1
        System.out.printf("(%e <= %e) ^ (%e != -2) --> %b\n", a, b, b, (a <= b) ^ (b != -6.3));
        // logical NOT
        System.out.printf("!(%e >= %e) --> %b\n", a, b, !(a >= b));

        System.out.println("\n-------- Misc Operators(Double) -------------");

        System.out.println("\nCondition Operator(Double):");
        //(a > b) ? a : b --- If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
        System.out.printf("%e > %e ? %e : %e --> %e\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator(Double):");
        double d;
        int in =2147483647;
        byte bt = 127;
        short sh = -32768;
        char ch = 65533;
        long l = 9223372036854775807L ;
        float f = 21474438737443.343423f;
        boolean bool = true;
        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);

        //-1.7E+308...1.7E+308 - double
        d = bt;
        System.out.printf("double = byte: d = %d --> d = %e\n", bt, d);//-128...127 - byte
        d = sh;
        System.out.printf("double = short: d = %d --> d = %e\n", sh, d);//-32768...32767 - short
        d = ch;
        System.out.printf("double = char: d = %c --> d = %e\n", ch, d);//0...65536 - char
        d = in;
        System.out.printf("double = int: d = %d --> d = %e\n", in, d);//-2147483648...2147483647 - int
        d = l;
        System.out.printf("double = long: d = %d --> d = %e\n", l, d);//-9223372036854775808...9223372036854775807 - long ????????????
        d = f;
        System.out.printf("double = float: d = %f --> d = %e\n", f, d); //-3.4*10^38...3.4*10^38 - float
        //d = (double) bool;
        System.out.printf("double = boolean: d = (double)%b --> Compile Error\n", bool);
        //d  = (double) str;
        System.out.printf("double = String: d  = (double)%s --> Compile Error\n", str);
        //d  = (double) stud;
        System.out.printf("double = Student: d  = (double)%s --> Compile Error\n", stud);
    }
    /* Testing boolean type. */
    public static void testBoolean(){
        boolean a = true, b = false, c;

        System.out.println("\n------------ Arithmetical Operators(Boolean) ----------------");
        System.out.println("\nArithmetical operators aren't used with boolean type");

        System.out.println("\n------- Bitwise Operators(Boolean) -----------");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        System.out.println("Bitwise operators ~, <<, >>, >>>  are not allowed to use with boolean");

        System.out.println("\n-------------- Assignment Operators(Boolean) ------------------");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        System.out.println("Assignment operators +=, -= a, *=, /=, %=, >>=, >>>=, <<=  are not allowed to use with boolean");

        System.out.println("\n--------- Relational Operators(boolean)------------------");
        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
         // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        System.out.println("Relational operators >, >=, <=, < are not allowed to use with boolean");

        System.out.println("\n------------ Logical Operations(Boolean) ----------------");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a & b; // bitwise logical AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a | b; // bitwise logical OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);

        System.out.println("\n------- Misc Operators(Boolean) ----------");
        System.out.println("\nCondition Operator:");
        System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
        System.out.println("Boolean value couldnt be converted to another types, as well be obtained from any other type.");
    }
    /* Testing Student reference type. */
    public static void testStudent(){
         Student a = new Student("Shiman", 9);
         Student b = new Student("Chileko", 10);
         Student c;

         System.out.println("\n------- Arithmetical operators couldnt be used with reference type Student ----------");
         System.out.println("\n------- Bitwise operators couldnt be used with reference type Student ---------------");
         System.out.println("\n------- Assignment operators couldnt be used with reference type Student ---------");

         System.out.println("\n--------- Relational Operators ==, != the only which are used with reference type Student -------");
         // equal to
         System.out.printf("%s == %s --> %b\n", a, b, a == b);
         // not equal to
         System.out.printf("%s != %s --> %b\n", a, b, a != b);

         System.out.println("\n------- Logical operators with reference type Student ---------------");
         // logical AND
         System.out.printf("(%s == %s) && (%s != null) --> %b\n", a, b, a, (a == b) && (a != null));
         // bitwise logical AND
         System.out.printf("(%s == %s) & (%s != null) --> %b\n", a, b, a, (a  ==  b) & (a != null));
         // logical OR
         System.out.printf("(%s != %s) || (%s == null) --> %b\n", a, b, b, (a !=  b) || (b == null));
         // bitwise logical OR
         System.out.printf("(%s != %s) | (%s == null) --> %b\n", a, b, b, (a !=  b) | (b == null));
         // logical XOR
         System.out.printf("(%s == %s) ^ (%s != null) --> %b\n", a, b, b, (a == b) ^ (b != null));
         // logical NOT
         System.out.printf("!(%s == %s) --> %b\n", a, b, !(a == b));

         System.out.println("\n------- Misc Operators with reference type Student ----------");

         System.out.println("\nCondition Operator:");
         System.out.printf("%s > %s ? %s : %s --> %s\n", a, b, a, b, (a != b ? a : b));

         System.out.println("\nType cast operator:");
         int in =128;
         byte bt = 120;
         short sh = -32768;
         char ch = 65533;
         long l = 2147483648483433L ;
         float f = 21474.23f;
         double d = 2147483647.12;
         boolean bool = true;
         String str = "abracadabra";

         //c = (Student) bt;
         System.out.printf("c = byte: c = (Student)%d  --> Compile Error\n", bt);
         //c = (Student)sh;
         System.out.printf("c = short: c = (Student)%d  --> Compile Error\n", sh);
         //c = (Student) ch;
         System.out.printf("c = char: c = (Student)%c  --> Compile Error\n", ch);
         // c = (Student) in
         System.out.printf("c = int: c = (Student)%d --> sh = %d\n", in, sh);
         //c = (Student) l;
         System.out.printf("c = long: c = (Student)%d --> Compile Error\n", l);
         //c = (int) f;
         System.out.printf("c = float: c = (Student)%f  --> Compile Error\n", f);
         //c = (Student) d;
         System.out.printf("c = double: c  = (Student)%e  --> Compile Error\n", d);
         //c = (Student) bool;
         System.out.printf("c = boolean: c = (Student)%b --> Compile Error\n", bool);
         //stud = (Student) str;
         System.out.printf("stud = String: stud = (Student)%s --> Compile Error\n", str);
         //stud = (Student) stud;
         System.out.printf("stud = Student: stud = (Student)%s --> Compile Error\n", a);

         System.out.println("\n-------instanceof operator(Student):--------");
         bool = a instanceof Student;
         System.out.println(a + " instanceof Student --> " + bool);
         //bool = a instanceof String;
         System.out.println(a + " instanceof String --> compile error");
     }
    /* Testing String type. */
    public static void testString(){
        System.out.println("\n----------- Arithmetical operations(String) -----------");
        String a = "first string";
        String b = "second string";
        String c;
        //concatenation
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        System.out.println("\n------- Another arithmetical operators couldnt be used with String type  ----------");

        System.out.println("\n------- Bitwise operators couldnt be used with String type ---------------");

        System.out.println("\n------- Assignment operators(String) ---------");
        System.out.printf("%s + %s = %s\n", a, b, c += a);
        System.out.println("\n------- Another assignment operators couldnt be used with String type  ----------");

        System.out.println("\n--------- Relational Operators ==, != the only which are used with String type -------");
        // equal to
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%s != %s --> %b\n", a, b, a != b);

        System.out.println("\n------- Logical operators with reference String type ---------------");
        // logical AND
        System.out.printf("(%s == %s) && (%s != null) --> %b\n", a, b, a, (a == b) && (a != null));
        // bitwise logical AND
        System.out.printf("(%s == %s) & (%s != null) --> %b\n", a, b, a, (a  ==  b) & (a != null));
        // logical OR
        System.out.printf("(%s != %s) || (%s == null) --> %b\n", a, b, b, (a !=  b) || (b == null));
        // bitwise logical OR
        System.out.printf("(%s != %s) | (%s == null) --> %b\n", a, b, b, (a !=  b) | (b == null));
        // logical XOR
        System.out.printf("(%s == %s) ^ (%s != null) --> %b\n", a, b, b, (a == b) ^ (b != null));
        // logical NOT
        System.out.printf("!(%s == %s) --> %b\n", a, b, !(a == b));

        System.out.println("\n------- Misc Operators with reference String type  ----------");

        System.out.println("\nCondition Operator:");
        System.out.printf("%s > %s ? %s : %s --> %s\n", a, b, a, b, (a != b ? a : b));

        System.out.println("\nType cast operator:");
        int in =128;
        byte bt = 120;
        short sh = -32768;
        char ch = 65533;
        long l = 2147483648483433L ;
        float f = 21474.23f;
        double d = 2147483647.12;
        boolean bool = true;
        String str = "this is string";
        Student stud = new Student("Anton Mirhil", 7);
        //c = (String) bt;
        System.out.printf("String = byte: c = (String)%d  --> Compile Error\n", bt);
        //c = (String)sh;
        System.out.printf("String = short: c = (String)%d  --> Compile Error\n", sh);
        //c = (String) ch;
        System.out.printf("String = char: c = (String)%c  --> Compile Error\n", ch);
        // c = (String) in
        System.out.printf("String = int: c = (String)%d --> sh = %d\n", in, sh);
        //c = (String) l;
        System.out.printf("String = long: c = (String)%d --> Compile Error\n", l);
        //c = (String) f;
        System.out.printf("String = float: c = (String)%f  --> Compile Error\n", f);
        //c = (String) d;
        System.out.printf("String = double: c  = (String)%e  --> Compile Error\n", d);
        //c = (String) bool;
        System.out.printf("String = boolean: c = (String)%b --> Compile Error\n", bool);
        //str = (String) str;
        System.out.printf("String = String: c = (String)%s --> Compile Error\n", str);
        //str = (String) stud;
        System.out.printf("String = Student: c = (String)%s --> Compile Error\n", stud);

        System.out.println("\n------- instanceof operator(String):--------");
        //bool = a instanceof Student;
        System.out.println(a + " instanceof Student -->  compile error");
        bool = a instanceof String;
        System.out.println(a + " instanceof String -->"+bool);

    }
}