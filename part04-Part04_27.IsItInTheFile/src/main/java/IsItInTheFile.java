
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = true;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if(row.equals(searchedFor)){
                    System.out.println("Found!");
                    found = true;
                    break;
                }else{
                    found = false;
                }
                
            }
            if(found == false){
                System.out.println("Not found.");
            }

            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Reading the file "+file+" failed");
        }

    }
}
