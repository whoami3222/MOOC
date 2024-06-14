import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
    }

    public static int smallest(int[] array) {
        int smallest = 1000;
        for (int i : array) {
            if(i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int index = 0;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if(table[i] <= smallest){
                smallest = table[i];
                index = i;
                  
            }
                
            }
            return index; 
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
           int n = MainProgram.indexOfSmallestFrom(array, i);
           swap(array, i, n);
           System.out.println(Arrays.toString(array));
        }
    }
    
        
}
