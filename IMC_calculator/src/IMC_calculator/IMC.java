package IMC_calculator;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime tu peso:");
        double peso = scanner.nextDouble();
        System.out.print("Dime tu altura:");
        double altura = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.println("Tu índice de masa corporal es: " + Math.round(imc));

        scanner.close();
    }
}
