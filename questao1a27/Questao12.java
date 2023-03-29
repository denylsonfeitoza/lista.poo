package questao1a27;
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.print("Digite o dia do mês de fevereiro (entre 1 e 28): ");
        dia = sc.nextInt();

        int diaDaSemana = (dia + 5) % 7;

        switch (diaDaSemana) {
            case 0:
                System.out.println("O dia " + dia + " será um domingo.");
                break;
            case 1:
                System.out.println("O dia " + dia + " será uma segunda-feira.");
                break;
            case 2:
                System.out.println("O dia " + dia + " será uma terça-feira.");
                break;
            case 3:
                System.out.println("O dia " + dia + " será uma quarta-feira.");
                break;
            case 4:
                System.out.println("O dia " + dia + " será uma quinta-feira.");
                break;
            case 5:
                System.out.println("O dia " + dia + " será uma sexta-feira.");
                break;
            case 6:
                System.out.println("O dia " + dia + " será um sábado.");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
        sc.close();
    }
}
