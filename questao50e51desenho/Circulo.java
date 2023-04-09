package questao50e51desenho;

import javafx.scene.canvas.GraphicsContext;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio, double x, double y) {
        super(x, y);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void desenha(GraphicsContext gc, double x, double y) {
        gc.strokeOval(x - raio, y - raio, raio * 2, raio * 2);
    }

    @Override
    public String toString() {
        return "Círculo";
    }
}
