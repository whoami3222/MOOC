
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = -1;
        String longestName = "";
        double avg = 0;
        double sum = 0;
        double amount = 0;

        while (true) {
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] string = input.split(",");

            int length = string[0].length();
            String name = string[0];
            int years = Integer.valueOf(string[1]);

            amount++;

            sum =sum + years;
            avg = sum/amount;

            if(length > longest){
                longest = length;
                longestName = name;
            }
                  
        }
        
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+avg);

    }
}
