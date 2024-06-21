import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class search {
    Scanner scan = new Scanner(System.in);
    //private static String file;

    public search(){
        //file = this.file;
        scan = this.scan;
    }

    public static void SearchRecipe(String file){
           
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookTime;
                try {
                    cookTime = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid cook time for recipe " + name + ", skipping...");
                    // Skip this recipe
                    while (scanner.hasNextLine() && !scanner.nextLine().isEmpty()) {
                        // Skip the ingredients lines
                    }
                    continue;
                }

                ArrayList<String> ingredients = new ArrayList<>();
                String line;
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }

                System.out.println(name + ", cooking time: " + cookTime);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void SearchName(String nameR, String file){
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookTime;
                try {
                    cookTime = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid cook time for recipe " + name + ", skipping...");
                    // Skip this recipe
                    while (scanner.hasNextLine() && !scanner.nextLine().isEmpty()) {
                        // Skip the ingredients lines
                    }
                    continue;
                }

                ArrayList<String> ingredients = new ArrayList<>();
                String line;
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }

                if(name.contains(nameR)){
                    System.out.println(name + ", cooking time: " + cookTime);
                }

            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }


    public static void SearchTime(int time, String file){
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookTime;
                try {
                    cookTime = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid cook time for recipe " + name + ", skipping...");
                    // Skip this recipe
                    while (scanner.hasNextLine() && !scanner.nextLine().isEmpty()) {
                        // Skip the ingredients lines
                    }
                    continue;
                }

                ArrayList<String> ingredients = new ArrayList<>();
                String line;
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }

                if(cookTime<= time){
                    System.out.println(name + ", cooking time: " + cookTime);
                }

            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void SearchIngredient(String ingredientF, String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookTime;
                try {
                    cookTime = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid cook time for recipe " + name + ", skipping...");
                    // Skip this recipe
                    while (scanner.hasNextLine() && !scanner.nextLine().isEmpty()) {
                        // Skip the ingredients lines
                    }
                    continue;
                }

                ArrayList<String> ingredients = new ArrayList<>();
                String line;
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }

                if(ingredients.contains(ingredientF)){
                    System.out.println(name + ", cooking time: " + cookTime);
                }

            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
