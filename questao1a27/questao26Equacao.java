package questao1a27;
public class questao26Equacao {
    private double a;
    private double b;
    private double c;

    public questao26Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calcularDelta() {
        return b * b - 4 * a * c;
    }

    public double calcularRaiz1() {
        return (-b + Math.sqrt(calcularDelta())) / (2 * a);
    }

    public double calcularRaiz2() {
        return (-b - Math.sqrt(calcularDelta())) / (2 * a);
    }

    public void imprimirRaizes() {
        double delta = calcularDelta();

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.printf("A equação possui uma raiz real: %.2f%n", calcularRaiz1());
        } else {
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f%n", calcularRaiz1(), calcularRaiz2());
        }
    }
}
