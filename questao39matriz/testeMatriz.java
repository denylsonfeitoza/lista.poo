package questao39matriz;

public class testeMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz(5.0f, 6.0f, 7.0f, 10.0f);

        System.out.println("Matriz:");
        m.print();

        System.out.println("Determinante: " + m.det());
    }
}

