import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab6Q2C {
    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Create an array to store 10 numbers
        int[] numbers = new int[10];

        // Variable to store the sum
        int sum = 0;

        // Display message
        System.out.println("Please enter 10 numbers:");

        // Start counter from 0
        int i = 0;

        // Get 10 numbers from the user
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            // Add each number to the sum
            sum = sum + numbers[i];

            // Move to the next position
            i++;
        }

        // Display the entered numbers
        System.out.println("\nNumbers entered are:");

        i = 0;

        while (i < 10) {
            System.out.println(numbers[i]);

            // Move to the next number
            i++;
        }

        // Calculate the average
        double average = (double) sum / 10;

        // Display sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close Scanner
        input.close();
    }
}