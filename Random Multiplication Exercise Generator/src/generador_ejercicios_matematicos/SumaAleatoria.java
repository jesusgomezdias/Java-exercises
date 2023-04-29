package generador_ejercicios_matematicos;
import java.util.Random;

public class SumaAleatoria {
    public static void main(String[] args) {
        Random rand = new Random();
        int numEjercicios = 5;
        
        for (int i = 0; i < numEjercicios; i++) {
            int num1 = rand.nextInt(80);
            int num2 = rand.nextInt(10);
            System.out.println(num1 + " + " + num2 + " =");
        }
    }
}