package questao31elevador;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 5); // capacidade de 8 pessoas, 10 andares

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Total de andares: " + elevador.getTotalAndares());
        System.out.println("Capacidade: " + elevador.getCapacidade());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        System.out.println("\nPessoas presentes: " + elevador.getPessoasPresentes());

        elevador.sobe();
        elevador.sobe();
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.sai();
        System.out.println("\nPessoas presentes: " + elevador.getPessoasPresentes());

        elevador.desce();
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.entra();
        elevador.entra();
        elevador.desce();
        System.out.println("\nPessoas presentes: " + elevador.getPessoasPresentes());
        System.out.println("Andar atual: " + elevador.getAndarAtual());
    }
}
