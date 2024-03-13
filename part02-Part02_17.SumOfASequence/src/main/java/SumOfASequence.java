
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int i=0;
        System.out.println("Last number?");
        int n = scanner.nextInt();

        // while(i<=n){
        //     sum= sum+i;
        //     i++;
        // }

        for(i=0;i<=n;i++){
            sum = sum + i;
        }
        
        System.out.println(sum);
    }
}
