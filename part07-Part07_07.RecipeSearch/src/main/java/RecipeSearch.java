import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    private static String file;
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Files to read: ");
        file = scan.nextLine();

        userInterface.start(file);
        

    }


    
}
