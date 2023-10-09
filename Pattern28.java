public class Pattern28 {
    public static void main(String[] args) {
        int n = 5; // Define the number of rows (adjust as needed)

        // First half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers from i to n
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println();
        }

        // Second half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers from i to n
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println();
        }
    }
}
