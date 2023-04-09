package questao41produto;

public class CalcularProduto {
    public static int produto(int... numeros) {
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println(produto(2, 4, 6));
        System.out.println(produto(1, 3, 5, 7));
        System.out.println(produto(2, 2, 2, 2, 2)); 
        System.out.println(produto()); 
    }
}
