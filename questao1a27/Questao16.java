package questao1a27;
public class Questao16 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int num = i;
            int soma = 0;
            while (num > 0) {
                int n = num % 10;
                soma += n * n * n;
                num /= 10;
            }
            if (soma == i) {
                System.out.println(i);
            }
        }
    }
}
