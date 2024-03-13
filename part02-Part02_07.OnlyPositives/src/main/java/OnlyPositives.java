
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            

            if(num<0){
                System.out.println("Unsuitable number");
                
                continue;
            }

            if(num==0){
                break;
            }

            if(num>0){
                System.out.println(Math.pow(num, 2));
                continue;
            }
        }
    }
}
