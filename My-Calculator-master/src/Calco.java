
import java.util.Scanner;

public class Calco {
    public static double myClco (double first, double second) {
        return first + second;

    }
    public static void main(String []args)  {

        double firstNum ;
        double secondNum ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");

        firstNum = scanner.nextDouble();


        System.out.println("Enter second number");

        secondNum = scanner.nextDouble();


        System.out.println("Enter operator + - * / ");
        char operator = scanner.next().charAt(0);

        scanner.nextLine();

        // user entered what they need now close
        scanner.close();

        double result =0;
        // double result
        switch (operator){
            case '+':
                // result =  firstNum+ secondNum;
                result = myClco (4,5);
                break;
            case '-':
                result= firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case'/':
                result= firstNum / secondNum;
                break;
            default:
                System.out.println("Wrong operator");
                return;
        }

        System.out.println(" result : " + result );

    }
}
