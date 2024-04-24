
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container contain = new Container();
        Container contain2 = new Container();

        

        Scanner scan = new Scanner(System.in);


        while (true) {
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                System.out.println("First : " + contain);
                System.out.println("Second : " + contain2);
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            //System.out.println();
            if(command.equals("add") && amount >= 0){
               contain.add(amount);
            }

            if(command.equals("move") && amount >= 0){
                contain2.add(Math.min(contain.contains(), amount));
                contain.remove(amount);
            }

            
            if(command.equals("remove") && amount>= 0){
                contain.remove(amount);
            }

        }
    }

}
