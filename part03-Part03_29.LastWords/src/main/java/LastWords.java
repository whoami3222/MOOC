
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] string = input.split(" ");

            System.out.println(string[string.length-1]);

        }
    }
}
