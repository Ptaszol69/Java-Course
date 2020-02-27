public class section3lessons24 {
    public static void main(String[] args ){

        //Lesson 24
        int myIntValue = 12000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);

        //Lesson 25

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        //Lesson 26

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
