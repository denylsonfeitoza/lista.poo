package questao50e51desenho;

import javafx.scene.canvas.GraphicsContext;
import java.util.List;

public class Desenho {
    private List<FiguraGeometrica> figuras;
    private List<Double> coordenadas;

    public Desenho(List<FiguraGeometrica> figuras, List<Double> coordenadas) {
        this.figuras = figuras;
        this.coordenadas = coordenadas;
    }

    public void adicionaFigura(FiguraGeometrica figura, double x, double y) {
        figuras.add(figura);
        coordenadas.add(x);
        coordenadas.add(y);
    }

    public void apresenta(GraphicsContext gc) {
        for (int i = 0; i < figuras.size(); i++) {
            FiguraGeometrica figura = figuras.get(i);
            double x = coordenadas.get(i * 2);
            double y = coordenadas.get(i * 2 + 1);
            figura.desenha(gc, x, y);
            System.out.println(figura + " desenhado em (" + x + ", " + y + ")");
        }
    }
}