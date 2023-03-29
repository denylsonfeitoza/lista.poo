package questao29fatura;

public class TesteFatura {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Teclado", 2, 50.0);
        Fatura fatura2 = new Fatura("002", "Mouse", -1, -20.0);

        System.out.println("Fatura 1 - Total: R$" + fatura1.calculaTotal());
        System.out.println("Fatura 2 - Total: R$" + fatura2.calculaTotal());
    }
}
