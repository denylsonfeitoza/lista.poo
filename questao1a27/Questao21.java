package questao1a27;
import java.util.Scanner;

public class Questao21 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = sc.nextInt();
        boolean resul = primo(n);
        if (resul) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
        sc.close();
    }
    
    public static boolean primo(int n) {
        return primoRecursivo(n, 2);
    }
    
    private static boolean primoRecursivo(int n, int div) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % div == 0) {
            return false;
        }
        if (div * div > n) {
            return true;
        }
        return primoRecursivo(n, div + 1);
    }
}
