
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        boolean goAgain = true;

        System.out.println("Please enter a value between 0 and 9");
        try (Scanner sc = new Scanner(System.in)) {
            while (goAgain) {
                try {
                    String input = sc.nextLine();

                    int myNumber = Integer.parseInt(input);


                    if (myNumber >= 0 && myNumber <= 9) {
                        System.out.println("You entered: " + myNumber);
                        goAgain = false;

                    }

                }catch (NumberFormatException ne) {
                    System.out.println("Please enter a value betweeen 0 and 9");
                }
            }
        }catch (InputMismatchException e) {
        System.out.println("Please enter a value betweeen 0 and 9");
        }
    }
}









