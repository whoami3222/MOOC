
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();

            if(input.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in latin: ");
                String latinName = scan.nextLine();
                birdDatabase.addBird(name,latinName);
                
            }
            else if(input.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birdDatabase.addObservation(name);
            }
            else if(input.equals("All")){
                birdDatabase.printAllBirds();
            }
            else if(input.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birdDatabase.printOneBird(name);
            }
            else if(input.equals("Quit")){
                break;
            }
            else{
                System.out.println("Wrong command");
                continue;
            }
        }
    }

}
