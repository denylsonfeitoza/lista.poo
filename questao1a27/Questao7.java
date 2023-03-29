package questao1a27;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        // Comparação dos números
        int menor = num1; // Assumimos que o primeiro número é o menor
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Exibição do resultado
        System.out.println("O menor número é: " + menor);

        sc.close(); // Fechando o Scanner
    }
}
