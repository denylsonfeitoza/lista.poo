package questao1a27;
public class Questao17 {
    public static void main(String[] args) {
        int A = 7000;
        int B = 20000;
        int i = 0;
        
        while(A < B) {
            A += (int) (A * 0.035); 
            B += (int) (B * 0.01);
            i++;
        }
        
        System.out.println("Serão necessários " + i + " anos para que a população de A ultrapasse a de B.");
    }
}
