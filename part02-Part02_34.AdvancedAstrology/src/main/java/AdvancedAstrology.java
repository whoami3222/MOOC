
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i< number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i<number){
            i++;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int j =0;
        while (i<=size) {
            printSpaces(size-i);
            printStars(i);           
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        for(int i=1;i<=height;i++){
            printSpaces(height-i);
            printStars(2 * i - 1);
        }
            

        for(int j=1;j<3;j++){
            printSpaces(height - 2);
            printStars(3);
        }
            
            
    }


    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
