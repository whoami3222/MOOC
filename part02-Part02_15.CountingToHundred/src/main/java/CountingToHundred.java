
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        for(int i = num1; i<=100;i++){
            System.out.println(i);
        }
    }
}
