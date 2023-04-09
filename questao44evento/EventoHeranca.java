package questao44evento;

public class EventoHeranca extends DataHora {
    private String nomeEvento;

    public EventoHeranca(String nomeEvento, int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano, hora, minuto);
        this.nomeEvento = nomeEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    @Override
    public String toString() {
        return nomeEvento + " - " + super.toString();
    }
}
