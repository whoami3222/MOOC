import java.util.ArrayList;
import java.util.Scanner;

public class functionality {
    static ArrayList<String> birds = new ArrayList<String>();
    static ArrayList<String> birdsLatin = new ArrayList<String>();
    static Scanner scan = new Scanner(System.in);
    static int count = 0;

    public functionality(){

    }

    public static void AddBird(){
        System.out.print("Name: ");
        String name = scan.nextLine();
        birds.add(name);
        System.out.print("Name in Latin: ");
        String nameLatin = scan.nextLine();
        birdsLatin.add(nameLatin);
    }

    public static void Observation(){
        System.out.print("Bird? ");
        String bird = scan.nextLine();
        if(birds.contains(bird)){
            count++;
        }
    }

}
