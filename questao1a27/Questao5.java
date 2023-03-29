package questao1a27;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 3 dígitos no formato CDU: ");
        int num = sc.nextInt();

        int u = num % 10;
        int d = (num / 10) % 10;
        int c = (num / 100) % 10;

        int novoNum = u * 100 + d * 10 + c;

        System.out.println("O número reescrito no formato UCD é: " + novoNum);

        sc.close(); 
    }
}
