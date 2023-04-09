package questao37atributos;

public class Atributo <N> {
    private N atr1;
    private N atr2;
    private N atr3;

    public Atributo(N atr1, N atr2, N atr3) {
        this.atr1 = atr1;
        this.atr2 = atr2;
        this.atr3 = atr3;
    }

    public int countIguais() {
        int count = 0;
        if (atr1.equals(atr2)) count++;
        if (atr1.equals(atr3)) count++;
        if (atr2.equals(atr3)) count++;
        return count;
    }

    public void imprimir() {
        System.out.println("Atributo 1: " + atr1);
        System.out.println("Atributo 2: " + atr2);
        System.out.println("Atributo 3: " + atr3);
    }
}
