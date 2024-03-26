
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int number = scanner.nextInt();

        //int greatest = list.get(0);

        // implement finding the greatest number in the list here
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            
            if (index == number) {
                    System.out.println(number +" is at index "+ i);
            }      
        }
        //System.out.println("The greatest number: "+greatest);
    }
}
