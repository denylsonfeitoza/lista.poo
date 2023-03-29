package questao38agenda;
import java.util.Scanner;

public class AgendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(100);
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar entrada na agenda");
            System.out.println("2. Listar entradas de um dia especifico");
            System.out.println("0. Sair");
            System.out.println();
            int opcao = sc.nextInt();
            
            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.println("Digite a data (dia, mês e ano separados por espaço):");
                int dia = sc.nextInt();
                int mes = sc.nextInt();
                int ano = sc.nextInt();
                System.out.println("Digite a hora:");
                int hora = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o assunto:");
                String assunto = sc.nextLine();
                EntradaEmAgenda entrada = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
                agenda.adicionarEntrada(entrada);
                System.out.println("Entrada adicionada com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Digite a data (dia, mês e ano separados por espaço):");
                int dia = sc.nextInt();
                int mes = sc.nextInt();
                int ano = sc.nextInt();
                EntradaEmAgenda[] entradasDia = agenda.listaDia(dia, mes, ano);
                System.out.println("Entradas para o dia " + dia + "/" + mes + "/" + ano + ":");
                for (EntradaEmAgenda entrada : entradasDia) {
                    System.out.println(entrada.listarDados());
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        }  
        System.out.println("Encerrando a agenda.");
        sc.close();
    }
}
