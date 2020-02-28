package com.ptaszol69;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 5;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 90;
        if(topScore >= 95)
            System.out.println("You got the high score!");

        int secondaryScore = 92;
        if((topScore > secondaryScore) && (secondaryScore > 95 ))
            System.out.println("Good Score " + "2018" + '\u00A9');

        if((topScore > 90) || (secondaryScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 13;
        if (newValue == 13)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // EXERCISE
        System.out.println("EXERCISE");
        System.out.println();
        System.out.println();

        double firstVariable = 20;
        double secondVariable = 80;
        double totalValue = (firstVariable + secondVariable) * 25;
        System.out.println(totalValue);
        totalValue = totalValue % 40;
        System.out.println(totalValue);
        if (totalValue <= 20)
            System.out.println("Total was over the limit");




    }
}
