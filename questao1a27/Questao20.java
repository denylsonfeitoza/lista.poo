package questao1a27;
import java.util.Scanner;

public class Questao20 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de m: ");
        int m = sc.nextInt();        
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        int resul = mdc(m, n);
        System.out.println("O MDC de " + m + " e " + n + " é: " + resul);
        sc.close();
    }
    
    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }
}
