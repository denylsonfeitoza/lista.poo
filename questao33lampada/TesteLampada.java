package questao33lampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada l = new Lampada();
        l.mostraEstado();
        l.acende();
        l.mostraEstado();
        l.acende();
        l.mostraEstado();
        l.apaga();
        l.mostraEstado();
        System.out.println("Quantidade de vezes que a lâmpada foi acesa: " + l.getContadorDeAcionamentos()); // Quantidade de vezes que a lâmpada foi acesa: 2
    }
}
