package questao38agenda;
import java.util.Arrays;

public class Agenda {
    private EntradaEmAgenda[] entradas;
    private int indice;
    
    public Agenda(int tamanho) {
        this.entradas = new EntradaEmAgenda[tamanho];
        this.indice = 0;
    }
    
    public void adicionarEntrada(EntradaEmAgenda entrada) {
        if (this.indice < this.entradas.length) {
            this.entradas[this.indice] = entrada;
            this.indice++;
        } else {
            System.out.println("Agenda cheia! Não é possível adicionar mais entradas.");
        }
    }
    
    public EntradaEmAgenda[] listaDia(int dia, int mes, int ano) {
        EntradaEmAgenda[] entradasDia = new EntradaEmAgenda[this.indice];
        int indiceDia = 0;
        for (int i = 0; i < this.indice; i++) {
            if (this.entradas[i].ehNoDia(dia, mes, ano)) {
                entradasDia[indiceDia] = this.entradas[i];
                indiceDia++;
            }
        }
        return Arrays.copyOf(entradasDia, indiceDia);
    }
}