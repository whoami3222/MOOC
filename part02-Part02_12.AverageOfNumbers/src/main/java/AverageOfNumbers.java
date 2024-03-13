
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ones = 0;
        double sum = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number:");
            double num = scanner.nextDouble();

            if(num==0){
                break;
            }
            ones = ones + 1;
            sum = num + sum;
            
        }
        avg = sum/ones;
        System.out.println("Average of the numbers: "+avg);
        
    }
    
}
