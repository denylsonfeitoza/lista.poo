package questao1a27;
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
