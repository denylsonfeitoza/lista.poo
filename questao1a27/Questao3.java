package questao1a27;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o valor do ângulo em graus: ");
        double graus = sc.nextDouble();
    
        double rad = Math.toRadians(graus);

        double sen = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        double cossec = 1 / sen;
        double sec = 1 / cos;
        double cotan = 1 / tan;

        System.out.println("O ângulo em radianos é: " + rad);
        System.out.println("Seno: " + sen);
        System.out.println("Cosseno: " + cos);
        System.out.println("Tangente: " + tan);
        System.out.println("Cossecante: " + cossec);
        System.out.println("Secante: " + sec);
        System.out.println("Cotangente: " + cotan);
    
        sc.close(); 
    }   
}
