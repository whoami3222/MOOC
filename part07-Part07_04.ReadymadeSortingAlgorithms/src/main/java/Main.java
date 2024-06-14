import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arrayS = {"a","d","p","b","z"};
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        integers.add(8);
        integers.add(0);
        integers.add(3);
        integers.add(12);
        integers.add(1);

        strings.add("a");
        strings.add("z");
        strings.add("c");
        strings.add("o");
        strings.add("d");

        sortStrings(strings);
        System.out.println(strings);

    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] arrayS) {
        Arrays.sort(arrayS);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
        
    }

}
