
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        String identifier;
        String name;

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
           if(identifier.equals("")){
            break;
           } 

           System.out.println("Name? (empty will stop)");
           name = scanner.nextLine();
           if(name.equals("")){
            break;
           } 

           Item item = new Item(identifier, name);


           boolean itemExists = false;
           for (Item i : items) {
            if(i.identifier.equals(item.identifier)){
                itemExists = true;
                break;
            }
           }


           if(!itemExists){
                items.add(new Item(identifier, name));
           }


        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }
        
    }
}
