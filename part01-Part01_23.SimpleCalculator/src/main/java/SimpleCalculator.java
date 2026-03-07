
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        Integer sumAddition = firstNumber + secondNumber;
        Integer sumMinus = firstNumber - secondNumber;
        Integer sumProduct = firstNumber * secondNumber;
        double sumQuotient = (double)firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sumAddition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + sumMinus);
        System.out.println(firstNumber + " * " + secondNumber + " = " + sumProduct);
        System.out.println(firstNumber + " / " + secondNumber + " = " + sumQuotient);



    }
}
