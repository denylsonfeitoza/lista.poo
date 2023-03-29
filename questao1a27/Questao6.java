package questao1a27;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em minutos: ");
        int min = sc.nextInt();

        int dias = min / 1440;
        int horas = (min % 1440) / 60;
        int minRestantes = min % 60;

        System.out.println(min + " minutos equivalem a " + dias + " dias, " + horas + " horas e " + minRestantes + " minutos.");
        sc.close();
    }
}
