package questao37atributos;

public class TesteAtributos {
    public static void main(String[] args) {
        Atributo<Integer> inteiros = new Atributo<>(1, 2, 3);
        inteiros.imprimir();
        System.out.println("Quantidade de iguais: " + inteiros.countIguais());

        Atributo<String> strings = new Atributo<>("a", "a", "c");
        strings.imprimir();
        System.out.println("Quantidade de iguais: " + strings.countIguais());

        Atributo<Double> doubles = new Atributo<>(1.2, 1.2, 1.2);
        doubles.imprimir();
        System.out.println("Quantidade de iguais: " + doubles.countIguais());
    }
}
