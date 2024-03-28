import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList <Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = scanner.nextInt();

            System.out.print("Publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(name, pages, year));
        }

        System.out.println("");

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        for (Book book : books) {
            if (input.equals("everything")) {
                System.out.println(book);
            }
            else if(input.equals("name")){
                System.out.println(book.getTitle());
            }
        }

        

    }
}
