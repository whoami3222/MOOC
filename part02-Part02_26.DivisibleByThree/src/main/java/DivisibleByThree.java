
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);

    }

    public static void divisibleByThreeInRange(int beginning, int end){
        
        int current = beginning;

        if (current % 3 !=0){
            current += 3 - (current % 3);
        }

        while (current <= end) {
            System.out.println(current);
            current+=3;
        }
        
        
    }

}
