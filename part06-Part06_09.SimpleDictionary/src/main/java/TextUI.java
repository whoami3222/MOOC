import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary object;

    public TextUI(Scanner scanner, SimpleDictionary object){
        this.scanner = scanner;
        this.object = object;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            else if(input.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                object.add(word, translation);
                continue;
            }
            else if(input.equals("search")){
                System.out.print("To be translated: ");
                String translated = scanner.nextLine();
                String translation = object.translate(translated);
                if (translation != null) {
                    System.out.println("Translation: " + translation);
                } else {
                    System.out.println("Word " + translated + " was not found");
                }
                continue;
            }
            else{
                System.out.println("Unknown command");
                continue;
            }
        }
        

    }

}
