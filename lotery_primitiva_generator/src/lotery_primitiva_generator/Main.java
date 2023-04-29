import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[6];
        int[] r = { random.nextInt(9) };

        for (int i = 0; i < 6; i++) {
            int numero = random.nextInt(49) + 1;

            // Check if the number is already in the array
            for (int j = 0; j < i; j++) {
                if (num[j] == numero) {
                    // Number is already in the array, generate a new one
                    i--;
                    break;
                }
            }

            // Add the number to the array
            num[i] = numero;
        }

        System.out.print("Numeros: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.print("\nReintegro: " + r[0]);
    }
}
