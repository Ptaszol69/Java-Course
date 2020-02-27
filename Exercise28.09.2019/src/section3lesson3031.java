public class section3lesson3031 {

    public static void main(String[] args){

        //LESSON 30

        char myChar = 'P';
        char myUnicodeChar = '\u0050';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myChar + "rzemek Słowik " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        //LESSON 31

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more. ";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "1313,13";
        numberString = numberString + "9797.97";
        System.out.println(numberString);

        String lastString = "13";
        int myInt = 12;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 123.45d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }

}
