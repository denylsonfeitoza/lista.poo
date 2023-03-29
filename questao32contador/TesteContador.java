package questao32contador;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        c.imprimir();
        c.incrementar();
        c.incrementar();
        c.imprimir();
        c.zerar();
        c.imprimir(); 
    }
}

