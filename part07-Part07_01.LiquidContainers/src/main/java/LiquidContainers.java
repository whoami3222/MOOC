
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containers = 0;
        int containers2 = 0;


        while (true) {
            System.out.print("> ");

            
            System.out.println("First : " + containers +"/100");
            System.out.println("Second : " + containers2+"/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

                for (String string : args) {
                    
                }
            System.out.println();
            

            if(command.equals("add") && amount >= 0){
                containers += amount;
                if(containers > 100){
                    containers = 100;
                }
            }

            if(command.equals("move") && amount >= 0){
                if(containers != 0){
                    
                    if(amount > containers){
                        amount -= containers + amount;
                    }
                    containers -= amount;
                    containers2 += amount;
                }
                    
                    
                
                
                if(containers2 > 100){
                    containers2 = 100;
                }
                if(containers < 0){
                    containers = 0; 
                }
            }

            if(command.equals("remove") && amount>= 0){
                containers2 -= amount;
                if(containers2 < 0){
                    containers2 = 0;
                }
            }


        }
    }

}
