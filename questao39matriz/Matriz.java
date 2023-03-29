package questao39matriz;

public class Matriz {
    private float[][] values;

    public Matriz(float a, float b, float c, float d) {
        values = new float[][] {{a, b}, {c, d}};
    }

    public float det() {
        return values[0][0] * values[1][1] - values[0][1] * values[1][0];
    }

    public void print() {
        System.out.printf("|%7.2f %7.2f|\n", values[0][0], values[0][1]);
        System.out.printf("|%7.2f %7.2f|\n", values[1][0], values[1][1]);
    }
}
