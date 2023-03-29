package questao38agenda;

public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;
    
    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }
    
    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
    
    public String listarDados() {
        return "Data: " + this.dia + "/" + this.mes + "/" + this.ano + "\n" +
               "Hora: " + this.hora + "\n" +
               "Assunto:" + this.assunto + "\n";
    }
    
    @Override
    public String toString() {
        return this.assunto;
    }
}
