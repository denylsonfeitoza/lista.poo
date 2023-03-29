package questao32contador;

public class Contador {
    private int valor;
    
    public Contador() {
        this.valor = 0;
    }
    
    public void zerar() {
        this.valor = 0;
    }
    
    public void incrementar() {
        this.valor++;
    }
    
    public void imprimir() {
        System.out.println("Valor do contador: " + this.valor);
    }
}
