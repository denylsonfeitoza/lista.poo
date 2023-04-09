package questao42simulador;
import java.util.Random;

public class SimuladorDados {
    public static void main(String[] args) {
        Random ger = new Random();
        int[] cont = new int[11];

        for (int i = 0; i < 36000000; i++) {
            int dado1 = ger.nextInt(6) + 1;
            int dado2 = ger.nextInt(6) + 1;
            int soma = dado1 + dado2;
            cont[soma - 2]++;
        }

        System.out.println("Soma\tFrequência");
        for (int i = 0; i < cont.length; i++) {
            int soma = i + 2;
            int freq = cont[i];
            System.out.printf("%d\t%d\n", soma, freq);
        }
    }
}