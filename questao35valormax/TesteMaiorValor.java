package questao35valormax;
import java.util.Scanner;

public class TesteMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite até 5 valores:   (0 se o valor for nulo)");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        System.out.println("Maior entre os valores é: " + MaiorValor.max(a,b,c,d,e));
        sc.close();
    }
}