

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number){
        int i = 0;
        while(i<number){ 
            System.out.println(number);
            number--;
        }
    }

}
