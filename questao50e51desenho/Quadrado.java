package questao50e51desenho;

import javafx.scene.canvas.GraphicsContext;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void desenha(GraphicsContext gc, double x, double y) {
        gc.strokeRect(x - lado / 2, y - lado / 2, lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado";
    }
}
