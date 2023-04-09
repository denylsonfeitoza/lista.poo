package questao47funcionario;

public class Assistente extends Funcionario {
    private int mat;
  
    public Assistente(String nome, double salario, int mat) {
      super(nome, salario);
      this.mat = mat;
    }
  
    public int getMat() {
      return mat;
    }
  
    public String toString() {
      return "Assistente " + getMat() + ": " + super.toString();
    }
  }  