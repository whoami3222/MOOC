import java.util.Scanner;

public class userInterface {

    static Scanner scan = new Scanner(System.in);

    public userInterface(){

    }

    public static void start(){
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();

            if(input.equals("Add")){
                functionality.AddBird();
            }
            else if(input.equals("Observation")){
                functionality.Observation();
            }
            else if(input.equals("All")){
    
            }
            else if(input.equals("One")){
    
            }
            else if(input.equals("Quit")){
                
            }
            else{
                
            }
        }
        
        
    }
}
