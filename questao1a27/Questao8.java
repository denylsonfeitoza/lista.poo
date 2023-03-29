package questao1a27;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do setor da loja (111 ou 222): ");
        int codigoSetor = sc.nextInt();

        System.out.println("Digite o valor original do produto: ");
        double valorProduto = sc.nextDouble();

        if (codigoSetor == 111) {
            if (valorProduto > 100) {
                valorProduto = valorProduto * 0.6;
            } else if (valorProduto >= 50 && valorProduto <= 100) {
                valorProduto = valorProduto * 0.8;
            } else if (valorProduto < 50) {
                valorProduto = valorProduto * 0.9;
            } else {
                System.out.println("Valor inválido para o produto");
                sc.close();
                return;
            }
            System.out.println("Setor de Cama, Mesa e Banho");
            
        } else if (codigoSetor == 222) {
            if (valorProduto > 500) {
                valorProduto = valorProduto * 0.9;
            } else {
                System.out.println("Valor inválido para o produto");
                sc.close();
                return;
            }
            System.out.println("Setor de Eletros");
        } else {
            System.out.println("Setor Inválido");
            sc.close();
            return;
        }

        System.out.println("Valor com desconto: R$ " + String.format("%.2f", valorProduto));

        sc.close();
    }
}
