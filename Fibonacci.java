public class Fibonacci {

    public static void main(String[] args) {
        // Specify the number of terms in the Fibonacci sequence
        int n = 10; // Input value for number of Fibonacci terms
        
        // Print the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        
        // First two terms of Fibonacci sequence
        int first = 0, second = 1;
        
        // Print the first two terms if n is greater than or equal to 1
        if (n >= 1) {
            System.out.print(first + " ");
        }
        
        // Print the Fibonacci sequence for the remaining terms
        if (n >= 2) {
            System.out.print(second + " ");
        }
        
        // Loop to generate the rest of the Fibonacci sequence
        for (int i = 3; i <= n; i++) {
            int next = first + second; // Calculate the next Fibonacci number
            System.out.print(next + " "); // Print the next number
            first = second; // Move first and second forward
            second = next;
        }
    }
}
