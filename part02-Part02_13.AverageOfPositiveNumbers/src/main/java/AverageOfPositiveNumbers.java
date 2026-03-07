
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbOfNumbers = 0; 
        int positiveNumbers = 0;



        while (true) {
        int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == 0) {
                break;
            }

            if (numbers > 0) {
                positiveNumbers += numbers;
                numbOfNumbers = numbOfNumbers + 1;
                continue;
            } 
            

        }
        if (numbOfNumbers > 0) {
            double average = (double) positiveNumbers / numbOfNumbers;
            System.out.println(average);

        } else {
            System.out.println("Cannot calculate the average");
        }

        
    }
}
