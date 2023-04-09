package questao44evento;

public class EventoDelegacao {
    private String nomeEvento;
    private DataHora dataHora;

    public EventoDelegacao(String nomeEvento, DataHora dataHora) {
        this.nomeEvento = nomeEvento;
        this.dataHora = dataHora;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public void setDataHora(DataHora dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return nomeEvento + " - " + dataHora;
    }
}
