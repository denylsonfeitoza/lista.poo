package questao1a27;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, naipe;
        String nomeValor = "", nomeNaipe = "";
        
        System.out.print("Digite o valor da carta (1 a 13): ");
        valor = sc.nextInt();
        System.out.print("Digite o naipe da carta (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        naipe = sc.nextInt();

        switch (valor) {
            case 1:
                nomeValor = "Ás";
                break;
            case 2:
                nomeValor = "Dois";
                break;
            case 3:
                nomeValor = "Três";
                break;
            case 4:
                nomeValor = "Quatro";
                break;
            case 5:
                nomeValor = "Cinco";
                break;
            case 6:
                nomeValor = "Seis";
                break;
            case 7:
                nomeValor = "Sete";
                break;
            case 8:
                nomeValor = "Oito";
                break;
            case 9:
                nomeValor = "Nove";
                break;
            case 10:
                nomeValor = "Dez";
                break;
            case 11:
                nomeValor = "Valete";
                break;
            case 12:
                nomeValor = "Dama";
                break;
            case 13:
                nomeValor = "Rei";
                break;
            default:
                System.out.println("Valor de carta inválido!");
                System.exit(0);
        }

        switch (naipe) {
            case 1:
                nomeNaipe = "de Ouros";
                break;
            case 2:
                nomeNaipe = "de Paus";
                break;
            case 3:
                nomeNaipe = "de Copas";
                break;
            case 4:
                nomeNaipe = "de Espadas";
                break;
            default:
                System.out.println("Naipe de carta inválido!");
                System.exit(0);
        }

        System.out.println(nomeValor + " " + nomeNaipe); 
        sc.close();
    }
}
