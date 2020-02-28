package com.ptaszol69;

public class Main {

    public static void main(String[] args) {

        /*

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        int myTotal = myMaxValue/2;
        System.out.println(myTotal);

        //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        byte myTotalByteValue = (byte) (myMinByteValue/2);
        System.out.println(myTotalByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myTotalShortValue = (short)(myShortValue/2);

        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        */

        byte ExValueBy = 10;
        short ExValueSh = 20;
        int ExValueIn = 50;

        long ExValueAll = 50000L + 10L * (ExValueBy + ExValueSh + ExValueIn);

        System.out.println("Total Value is: " + ExValueAll);


    }
}
