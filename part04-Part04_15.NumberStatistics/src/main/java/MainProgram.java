
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
            Statistics statistics = new Statistics();
            Statistics statisticsEven = new Statistics();
            Statistics statisticsOdd = new Statistics();

            //.out.println("Count: " + statistics.getCount());
           // System.out.println("Sum: " + statistics.sum());
            //System.out.println("Average: " + statistics.average());
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");

        while (true) {
            int input = scanner.nextInt();

            if(input == -1 ){
                break;
            }

            statistics.addNumber(input);

            if(input%2==0){
                statisticsEven.addNumber(input);
            }else{
                statisticsOdd.addNumber(input);
            }

        }
        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Sum of even numbers: "+statisticsEven.sum());
        System.out.println("Sum of odd numbers: "+statisticsOdd.sum());

    }
}
