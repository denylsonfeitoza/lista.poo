package questao1a27;
import java.util.Scanner;

public class Questao19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = sc.nextInt();
        System.out.println("Fatorial de " + n + ": " + fatorial(n));
        sc.close();
    }
    
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            System.out.println("\tFatorial de " + n + ": 1");
            return 1;
        } else {
            int resul = n * fatorial(n-1);
            System.out.println("\tFatorial de " + n + ": " + resul);
            return resul;
        }
    }
}
