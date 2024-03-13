
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int n = scanner.nextInt();
        int i =1;
        int f = 1;
        while (i<=n) {   
            f = f * i;
            i++;
        }
        System.out.println("Factorial: "+f);


    }
}
