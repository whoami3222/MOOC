
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String nameoldest = "";
 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            String name = parts[0];

            if (age > oldest) {
                oldest = age;
                nameoldest = name;
            }
        }
 
        System.out.println("Name of the oldest: " + nameoldest);

    }
}
