package questao1a27;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
    
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
    
        System.out.println("Digite o terceiro número: ");
        double num3 = sc.nextDouble();
    
        double soma = num1 + num2 + num3;
        double media = soma / 3;
    
        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média aritmética dos três números é: " + media);
        sc.close();
    }    
}
