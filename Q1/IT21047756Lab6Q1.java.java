import java.util.Scanner; // Import Scanner to get keyboard input

public class IT21047756Lab6Q1 {
    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Calculate the square of the number
        double square = number * number;

        // Calculate the square root using Math.sqrt()
        double squareRoot = Math.sqrt(number);

        // Display the square
        System.out.println("The square of " + number + " is: " + square);

        // Display the square root
        System.out.println("The square root of " + number + " is: " + squareRoot);

        // Close the Scanner
        input.close();
    }
}