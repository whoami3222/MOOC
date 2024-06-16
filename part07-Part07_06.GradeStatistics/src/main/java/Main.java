
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sumP = 0;
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> passing = new ArrayList<>();
        int[] gradeDistribution = new int[6];

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = scanner.nextInt();

            if (input >= 0 && input <= 100) {
                integers.add(input);
                if (input >= 50) {
                    passing.add(input);
                }

                // Grade distribution
                if (input < 50) {
                    gradeDistribution[0]++;
                } else if (input < 60) {
                    gradeDistribution[1]++;
                } else if (input < 70) {
                    gradeDistribution[2]++;
                } else if (input < 80) {
                    gradeDistribution[3]++;
                } else if (input < 90) {
                    gradeDistribution[4]++;
                } else {
                    gradeDistribution[5]++;
                }
            } else if (input == -1) {
                break;
            }
        }


        for (Integer integer : integers) {
            sum += integer;
        }

        for (Integer passin : passing) {
            
                sumP += passin;

        }

        //console sout
        double avg = (double)sum / integers.size();
        System.out.println("Point average (all): "+avg);

        if (passing.size() > 0) {
            double avgP = (double) sumP / passing.size();
            System.out.println("Point average (passing): " + avgP);
        } else {
            System.out.println("Point average (passing): -");
        }

        double percentage = (100.0 * passing.size()) / integers.size();
        System.out.println("Pass percentage: " + percentage);

        System.out.println("Grade distribution: ");

        for (int i = gradeDistribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
