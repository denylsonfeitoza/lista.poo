package questao1a27;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto:");
        System.out.print("x: ");
        double x1 = sc.nextDouble();
        System.out.print("y: ");
        double y1 = sc.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto:");
        System.out.print("x: ");
        double x2 = sc.nextDouble();
        System.out.print("y: ");
        double y2 = sc.nextDouble();

        if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro.");
        } else if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro.");
        }
        
        if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro.");
        } else if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro.");
        }
        
        sc.close();
    }
}
