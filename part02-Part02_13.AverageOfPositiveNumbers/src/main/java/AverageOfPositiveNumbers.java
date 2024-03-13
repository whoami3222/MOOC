
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ones = 0;
        double sum = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number:");
            double num = scanner.nextDouble();

            if(num==0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if(num>0){
                ones = ones + 1;
                sum = num + sum;
            }
            
            
        }
        avg = sum/ones;
        System.out.println(avg);
    }
}
