package questao1a27;
public class Questao15 {
    
    public static boolean perfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma == n;
    }
    
    public static void main(String[] args) {
        int count = 0;
        int n = 2; // o primeiro número perfeito é 6
        while (count < 4) {
            if (perfeito(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
