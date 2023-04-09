package questao47funcionario;

public class Funcionario {
    private String nome;
    private double salario;
  
    public Funcionario(String nome, double salario) {
      this.nome = nome;
      this.salario = salario;
    }
  
    public void aumentarSalario(double aumento) {
      salario += aumento;
    }
  
    public double ganhoAnual() {
      return salario * 13;
    }
  
    public String toString() {
      return "Funcionário: " + nome + ", salário: R$" + salario;
    }
  }