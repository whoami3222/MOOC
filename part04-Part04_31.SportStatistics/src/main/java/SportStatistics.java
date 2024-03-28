
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                String[] info = row.split(",");

                String home = info[0];
                String visiting = info[1];
                String winner = "";
                int hpoints = Integer.valueOf(info[2]);
                int vpoints = Integer.valueOf(info[3]);

                if(home.equals(team) || visiting.equals(team)){
                    games++;
                    if(hpoints > vpoints){
                        winner = home;
                    }else{
                        winner = visiting;
                    }
                    if(winner.equals(team)){
                        wins++;
                    }

                }

                

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+(games - wins));

        

    




    }

}
