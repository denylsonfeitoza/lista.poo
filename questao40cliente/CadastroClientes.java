package questao40cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        int id, idade;
        String nome, telefone;

        do {
            System.out.print("Digite o ID do cliente (negativo para sair): ");
            id = sc.nextInt();
            if (id >= 1) {
                sc.nextLine();
                System.out.print("Digite o nome do cliente: ");
                nome = sc.nextLine();
                System.out.print("Digite a idade do cliente: ");
                idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o telefone do cliente: ");
                telefone = sc.nextLine();
                System.out.println();

                clientes.add(new Cliente(id, nome, idade, telefone));
            }
        } while (id >= 0);

        System.out.println("\nDados dos clientes cadastrados:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        sc.close();
    }
}