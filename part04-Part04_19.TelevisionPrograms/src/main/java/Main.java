import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: (Empty will end)");
            String program = scanner.nextLine();

            if (program.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(program, duration));

        }
        System.out.print("Program's maximum duration? ");
        int durationLimit = Integer.valueOf(scanner.nextLine());


        for (TelevisionProgram tp : programs) {
            if (tp.getDuration() <= durationLimit ) {
                System.out.println(tp);
            }
        }
    }
}
