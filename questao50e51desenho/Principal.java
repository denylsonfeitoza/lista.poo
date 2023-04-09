package questao50e51desenho;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Principal extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        List<FiguraGeometrica> figuras1 = new ArrayList<>();
        List<Double> coordenadas1 = new ArrayList<>();

        figuras1.add(new Quadrado(50, 100, 100));
        coordenadas1.add(150.0);
        coordenadas1.add(150.0);

        figuras1.add(new Circulo(30, 200, 200));
        coordenadas1.add(300.0);
        coordenadas1.add(300.0);

        Desenho desenho1 = new Desenho(figuras1, coordenadas1);

        List<FiguraGeometrica> figuras2 = new ArrayList<>();
        List<Double> coordenadas2 = new ArrayList<>();

        figuras2.add(new Triangulo(80, 100, 400, 200));
        coordenadas2.add(400.0);
        coordenadas2.add(300.0);

        figuras2.add(new Circulo(50, 500, 400));
        coordenadas2.add(500.0);
        coordenadas2.add(400.0);

        Desenho desenho2 = new Desenho(figuras2, coordenadas2);

        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

        desenho1.apresenta(gc);
        desenho2.apresenta(gc);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
