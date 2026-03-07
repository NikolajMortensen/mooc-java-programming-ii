import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tal = Integer.valueOf(scanner.nextInt());
        int product = tal * tal;

        System.out.println(product);


    }
}