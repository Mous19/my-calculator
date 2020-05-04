

import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {


        double firstNumber;
        double secondNumber;
        boolean keepGoing = true;

        Scanner scanner = new Scanner(System.in);

        while (keepGoing) {
            System.out.println("Please enter the first number");
            firstNumber = scanner.nextDouble();

            System.out.println("Pleas enter the second number");
            secondNumber = scanner.nextDouble();

            System.out.println("Please enter operator + - * / or q to quit");
            char operator = scanner.next().charAt(0);

            scanner.nextLine();

            double result = 0;

            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                case 'q':
                    keepGoing = false;
                    break;
                default:
                    System.out.println("It is not valid operator");

            }
            System.out.println("result : " + result);
        }
    }
}