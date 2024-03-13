
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int num1 = scanner.nextInt();
        System.out.print("Where from? ");
        int num2 = scanner.nextInt();


        for(int i = num2; i<=num1;i++){
            if(num1<num2){
                break;
            }
            System.out.println(i);
        }
    }
}
