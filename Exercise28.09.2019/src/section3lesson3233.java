public class section3lesson3233 {
    public static void main(String[] args){

        int result = 1 + 3;
        System.out.println("1 + 3 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 4 - 1 = 3
        System.out.println("4 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 13; // 3 * 13 = 39
        System.out.println("3 * 13 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result / 3; // 39 / 3 = 13
        System.out.println("39 / 3 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result % 3; // the remainder of (13 % 3) = 1
        System.out.println("13 % 3 = " + result);

        // 29.09.2019 Lesson 33

        // result = result + 3;

        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 5
        result /= 5; // 30 / 5 = 6
        System.out.println("30 / 5 = " + result);

        // result = result - 5
        result -= 5; // 6 - 5 = 1
        System.out.println("6 - 5 = " + result);

    }
}
