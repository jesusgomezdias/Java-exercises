package guess_number;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(21);
        int userNum = 0;
        int attempts = 6;
        
        Scanner scanner = new Scanner(System.in);

        while (userNum != num && attempts != 0) {
            System.out.print("Give me a number: ");
            userNum = scanner.nextInt();

            if (userNum != num) {
                attempts -= 1;
                System.out.println("ERROR " + " You have " + attempts + " attempts left");
            }

            if (attempts == 0) {
                System.out.println("Sorry, you have exhausted the number of attempts allowed.");
            }

            if (userNum == num) {
                System.out.println("Correct! The number was " + num);
            }
        }

        scanner.close();
    }
}
