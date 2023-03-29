package questao30provaFinal;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(12345, "Ruan", 8.5, 7.0, 9.0);
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nota prova 1: " + aluno1.getNotaProva1());
        System.out.println("Nota prova 2: " + aluno1.getNotaProva2());
        System.out.println("Nota trabalho: " + aluno1.getNotaTrabalho());
        System.out.printf("Média final: %.1f \n", aluno1.media());
        System.out.println("Nota necessária para prova final: " + aluno1.provaFinal());

        System.out.println();

        Aluno aluno2 = new Aluno(54321, "Alisson", 5.0, 4.0, 6.0);
        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Nota prova 1: " + aluno2.getNotaProva1());
        System.out.println("Nota prova 2: " + aluno2.getNotaProva2());
        System.out.println("Nota trabalho: " + aluno2.getNotaTrabalho());
        System.out.printf("Média final: %.1f \n", aluno2.media());
        System.out.println("Nota necessária para prova final: " + aluno2.provaFinal());
    }
}    