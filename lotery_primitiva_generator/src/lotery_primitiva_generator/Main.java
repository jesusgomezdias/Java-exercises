package lotery_primitiva_generator;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int[] reintegro = {random.nextInt(10)};

        while (numeros.size() < 6) {
            int numero = random.nextInt(49) + 1;

            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }
        }

        System.out.println("Numeros: " + numeros);
        System.out.println("Reintegro: " + reintegro[0]);
    }
}
