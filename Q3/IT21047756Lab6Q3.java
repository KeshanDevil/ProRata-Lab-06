import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab6Q3 {
    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Variable to store the sum of squares
        double sumOfSquares = 0;

        // Variable to count the number of valid numbers
        int count = 0;

        // Variable to store user input
        int number;

        // Display instructions
        System.out.println("Enter positive numbers.");
        System.out.println("Enter -99 to stop.");

        // Keep getting numbers until -99 is entered
        while (true) {

            System.out.print("Enter number: ");
            number = input.nextInt();

            // -99 means the user has finished entering numbers
            if (number == -99) {
                break;
            }

            // Check for other negative numbers
            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            // Add the square of the number to sumOfSquares
            sumOfSquares = sumOfSquares + (number * number);

            // Increase the count
            count++;
        }

        // Check whether at least one number was entered
        if (count > 0) {

            // Calculate Root Mean Square
            double rms = Math.sqrt(sumOfSquares / count);

            // Display the result
            System.out.println("Root Mean Square: " + rms);

        } else {
            System.out.println("No numbers were entered.");
        }

        // Close Scanner
        input.close();
    }
}