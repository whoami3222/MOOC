
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }

            String[] pieces = input.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                String con = pieces[i];
                if(con.contains("av")){
                    System.out.println(con);
                }
            }
        }
    }
}
