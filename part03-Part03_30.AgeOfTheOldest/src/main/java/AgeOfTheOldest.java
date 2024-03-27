
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        int helper = 0;
        while (true) {
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] string = input.split(",");

            for (int i = 0; i < string.length; i++) {
                helper = Integer.valueOf(string[1]);
                if(helper>oldest){
                    oldest = helper;
                }else{
                    break;
                }
            }
        }
        System.out.println("Age of the oldest: "+oldest);


    }
}
