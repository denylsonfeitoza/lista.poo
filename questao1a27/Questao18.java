package questao1a27;
public class Questao18 {

public static int pot(int base, int exp) {
    if (exp == 0) {
        return 1;
    } else {
        return base * pot(base, exp - 1);
    }
}

public static void main(String[] args) {
    int result = pot(3, 4);
    System.out.println(result);
    }
}