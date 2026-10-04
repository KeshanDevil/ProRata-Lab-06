import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab6Q2B {
    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Create an array to store 10 numbers
        int[] numbers = new int[10];

        // Display message
        System.out.println("Please enter 10 numbers:");

        // Start counter from 1
        int i = 0;

        // Get 10 numbers from the user
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            // Move to the next position
            i++;
        }

        // Print the entered numbers
        System.out.println("\nNumbers entered are:");

        i = 0;

        // Display all 10 numbers
        while (i < 10) {
            System.out.println(numbers[i]);

            // Move to the next number
            i++;
        }

        // Close Scanner
        input.close();
    }
}