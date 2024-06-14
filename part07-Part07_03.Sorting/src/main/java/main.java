public class main {
    public static void main(String[] args) {
        System.out.println(MathChallenge(4)); // Output: 0
        System.out.println(MathChallenge(19)); // Output: 2
        System.out.println(MathChallenge(1234678)); // Output: 2
    }
    
    public static int MathChallenge(int num) {
        // Base case: If the number is less than 10, its additive persistence is 0
        if (num < 10) {
            return 0;
        }
        
        // Initialize additive persistence count
        int persistence = 0;
        
        // Calculate sum of digits
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Move to the next digit
        }
        
        // Recursively call the function with the sum until it becomes a single digit
        return 1 + MathChallenge(sum);
    }
}