week2


    import java.util.Scanner; // Import Scanner for user input

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Ask user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Ask user to choose an operation
        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result = 0;

        // Perform the selected operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close(); // Close the scanner
    }
}
    

