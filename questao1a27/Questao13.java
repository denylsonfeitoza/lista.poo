package questao1a27;
public class Questao13 {
    public static void main(String[] args) {
        int[][] cartao = new int[6][10];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                cartao[i][j] = i * 10 + j + 1;
            }
        }
        
        System.out.println(" -------------------------------------------");
        System.out.println("|             CARTÃO MEGA-SENA              |");
        System.out.println(" -------------------------------------------");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("| ");
            for (int j = 0; j < 10; j++) {
                if (cartao[i][j] < 10) {
                    System.out.print("  " + cartao[i][j] + " ");
                } else {
                    System.out.print(" " + cartao[i][j] + " ");
                }
                if ((j + 1) % 5 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println(" -------------------------------------------");
    }
}
