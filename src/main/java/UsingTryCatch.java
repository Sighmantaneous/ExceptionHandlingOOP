import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 - 9: ");
        Scanner sc = new Scanner(System.in);

        int myNumber = sc.nextInt();

        if(myNumber>=0 && myNumber<=9) {
            System.out.println("You entered: " + myNumber);
        }
        else {
            System.out.println("Not a valid number");
        }
    }
}
