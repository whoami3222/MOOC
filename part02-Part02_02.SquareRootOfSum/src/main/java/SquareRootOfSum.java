
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();

        double squareRoot = Math.sqrt((num1+num2));
        System.out.println(squareRoot);
    }
}
