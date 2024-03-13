
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
       
        System.out.println("First number?");
        int i = scanner.nextInt();

        System.out.println("Last number?");
        int n = scanner.nextInt();

        // while(i<=n){
        //     sum= sum+i;
        //     i++;
        // }

        for(;i<=n;i++){
            sum = sum + i;
        }
        
        System.out.println(sum);
    }
}
