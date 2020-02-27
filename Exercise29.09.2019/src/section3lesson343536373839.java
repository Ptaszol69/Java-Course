public class section3lesson343536373839 {
    public static void main (String[] args){

        boolean isPrzemek = false;
        if(isPrzemek == false) {
            System.out.println("It is not a Przemek!");
            System.out.println("And I am scared of Przemek...");
        }

        // Lesson 35

        int topScore = 130;
        if(topScore != 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 65;
        if((topScore > secondTopScore) && (topScore < 150)){
            System.out.println("Greater than second top score and less than 150.");
        }

        // Lesson 36

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the condition are true..");
        }

        // Lesson 37

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true. ");
        }

        boolean isCar = false;
        if(isCar)/* if(!isCar) = if(isCar == false) */{
            System.out.println("This is not supposed to happen. ");
        }

        // Lesson 38

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true. ");
        }

        // Lesson 39 CHALLENGE

        double challNumOne = 20.00d;
        double challNumSec = 80.00d;
        double challSum = (challNumOne + challNumSec) * 100.00d;
        System.out.println(challSum);
        double challRemainder = challSum % 40.00d;
        System.out.println(challRemainder);
        boolean isChallRemainder = (challRemainder == 0) ? true : false;
        System.out.println(isChallRemainder);
        if(!isChallRemainder){
            System.out.println("Got some remainder");
        }
        /* if(challRemainder == 0){
            isChallRemainder = true;
            System.out.println("isChallRemainder is 0!");
        }
        else {
            isChallRemainder = false;
            System.out.println("isChallRemainder is not zero!.");
        } */

    }
}
