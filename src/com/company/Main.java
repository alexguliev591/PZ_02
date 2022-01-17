package com.company;

public class Main {

    public static void main(String[] args) {


        int i = 35;
        Integer.toString(i);
        String str = Integer.toString(i);
        System.out.println(str);

        double  q = 32.4e10;
        Double.toString(q);
        String stro = Double.toString(q);
        System.out.println(stro);

        long  w = 3422222;
        Long.toString(w);
        String stri = Long.toString(w);
        System.out.println(stri);

        float  e = 3.46f;
        Float.toString(e);
        String stre = Float.toString(e);
        System.out.println(stre);

        System.out.println("////////////////////");
        System.out.println("////////////////////");

        char ch = 'S';
        String myStr = Character.toString(ch);

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String myStro = "" + ch;
        System.out.println(myStro);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);


        char dev = '9';
        String myStri = Character.toString(dev);

        // c использованием метода getNumericValue
        // класса Character
        int i1 = Character.getNumericValue(dev);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(dev,10);
        System.out.println(i2);

        System.out.println("////////////////////");
        System.out.println("////////////////////");

        int r = 2015;
        long g = r;
        System.out.println(g);

        int t = 2015;
        float j = t;
        System.out.println(j);

        long m = 214748364;
        int c = (int) m;
        System.out.println(c);

        double d = 3.14;
        int h = (int) d;
        System.out.println(h);

    }
}
