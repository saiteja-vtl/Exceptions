import java.util.Scanner;

public class ArrayAccess {

    private int[] numbers;

    public ArrayAccess() {
        this.numbers = new int[]{10, 20, 30, 40, 50};
    }


    public void accessElement() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an index to access the element: ");
            try {
                int index = scanner.nextInt();
                System.out.println("Element at index " + index + " is: " + numbers[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index! Please try again.");
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ArrayAccess arrayAccess = new ArrayAccess();
        arrayAccess.accessElement();
    }
}

