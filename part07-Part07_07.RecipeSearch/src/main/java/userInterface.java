import java.util.Scanner;

public class userInterface {
        static Scanner scan = new Scanner(System.in);

        public userInterface(){
            
        }

        public static void start(String file){
            
            System.out.println();
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println();
    
            while (true) {
                System.out.print("Enter command: ");
                String command = scan.nextLine();
                if(command.equals("list")){
                    search.SearchRecipe(file);
                }
                else if(command.equals("stop")){
                    break;
                }
                else if(command.equals("find name")){
                    System.out.print("Searched word: ");
                    String nameR = scan.nextLine();
                    search.SearchName(nameR,file);
                }
                else if(command.equals("find cooking time")){
                    System.out.print("Max cooking time: ");
                    int time = scan.nextInt();
                    //scan.nextInt();
                    search.SearchTime(time,file);
                } 
                else if(command.equals("find ingredient")){
                    System.out.print("Ingredient: ");
                    String ingredientF = scan.nextLine();
                    //scan.nextInt();
                    search.SearchIngredient(ingredientF,file);
                }
            }
        }
       
}
