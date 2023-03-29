package questao1a27;
import java.time.LocalDate;

public class questao27Reserva {
    private String hospede;
    private LocalDate dataChegada;
    private LocalDate dataSaida;
    private int numeroQuarto;
    private double valorTotal;

    public questao27Reserva(String hospede, LocalDate dataChegada, LocalDate dataSaida, int numeroQuarto, double valorTotal) {
        this.hospede = hospede;
        this.dataChegada = dataChegada;
        this.dataSaida = dataSaida;
        this.numeroQuarto = numeroQuarto;
        this.valorTotal = valorTotal;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
