public class section3lesson2829 {
    public static void main(String[] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value is " + myMinFloatValue);
        System.out.println("Max Float Value is " + myMaxFloatValue);

        //19.09.2019

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value is " + myMinDoubleValue);
        System.out.println("Max Double Value is " + myMaxDoubleValue);

        int myIntValue = 13;
        float myFloatValue = 13f / 3f;
        double myDoubleValue = 13d / 3d;

        //25.09.2019 !!!LESSON 29!!!

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge

        double pound = 2d;
        double poundsToKilograms = (double)pound * 0.45359237d;
        System.out.println(poundsToKilograms);
    }
}
