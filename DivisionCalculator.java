import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {

    public void performDivision() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int num1 = 0;
        int num2 = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter only integers.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the second number: ");
                num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 / num2));
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter only integers.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Error: Denominator cannot be zero. Please enter a non-zero integer.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        DivisionCalculator divisionCalculator = new DivisionCalculator();
        divisionCalculator.performDivision();
    }
}


