import java.util.Scanner;

public class InputValidation {

    public void getValidAge() {
        System.out.println("Enter your  Age");
    }

    public static void main(String[] args) {
        InputValidation input = new InputValidation();
        Scanner in = new Scanner(System.in);
        boolean valid = true;
        while (valid == true) {
            try {
                input.getValidAge();
                int age = in.nextInt();
                if (age > 0 && age < 121) {
                    System.out.println("Input  is  valid");
                    valid=false;
                }else{
                    System.out.println("Enter a Valid number between 1 and 120");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Enter an Integer");
                in.next();
            }

        }
    }
}
