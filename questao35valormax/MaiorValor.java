package questao35valormax;

public class MaiorValor {
    public static double max(double a, double b, double c, double d, double e) {
        return Math.max(Math.max(Math.max(a, b), Math.max(c,d)), e);
    }
}