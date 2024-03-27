

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        

        // Implement the search functionality here
        System.out.print("Search for? ");
        int num = scanner.nextInt();

        System.out.println(" ");

        int i = 0;
        while (i<array.length) {
            int index = array[i];
            if(index==num){
                System.out.println(num+" is at index "+i+".");
                break;
            }else{
                System.out.println(num+" was not found.");
            }
            i++;
        }
    }

}
