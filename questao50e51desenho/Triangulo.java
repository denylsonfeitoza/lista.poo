package questao50e51desenho;

import javafx.scene.canvas.GraphicsContext;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void desenha(GraphicsContext gc, double x, double y) {
        double[] xPoints = new double[] { x - base / 2, x + base / 2, x };
        double[] yPoints = new double[] { y + altura / 2, y + altura / 2, y - altura / 2};
        gc.strokePolygon(xPoints, yPoints, 3);
    }
    
    @Override
    public String toString() {
        return "Triângulo";
    }
}    