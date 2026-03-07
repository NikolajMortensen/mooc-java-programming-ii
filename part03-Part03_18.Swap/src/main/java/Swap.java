
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("First indice: ");
        int firstIndice = Integer.valueOf(scanner.nextLine());

        System.out.println("Second indice: ");
        int secondIndice = Integer.valueOf(scanner.nextLine());

        swapElements(array, firstIndice, secondIndice);





        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    public static void swapElements(int[] array, int firstIndice, int secondIndice) {
        int temp = array[firstIndice]; // Copying the first indice

        array[firstIndice] = array[secondIndice];

        array[secondIndice] = temp;
    }

}
