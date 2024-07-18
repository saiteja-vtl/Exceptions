import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiOperationHandler {

    public void performOperations() {
        try {
            int result = divideNumbers(10, 0); // Example: 10 divided by 0
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException occurred: Cannot divide by zero");
        }

        try {
            int[] array = { 1, 2, 3 };
            int value = getElementAtIndex(array, 5);
            System.out.println("Value at index: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred: Index is out of bounds");
        }


        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException occurred: File not found");
        } catch (IOException e) {
            System.err.println("IOException occurred: Error reading file");
        }
    }

    private int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }

    private int getElementAtIndex(int[] array, int index) {
        return array[index];
    }

    private void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
        MultiOperationHandler handler = new MultiOperationHandler();
        handler.performOperations();
    }
}
