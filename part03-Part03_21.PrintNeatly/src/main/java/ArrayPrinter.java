
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num);
            if(i>=array.length-1){
                break;
            }
            System.out.print(", ");
        }
    }
}
