package questao47funcionario;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;
  
    public Administrativo(String nome, double salario, int mat, String turno, double adicionalNoturno) {
      super(nome, salario, mat);
      this.turno = turno;
      this.adicionalNoturno = adicionalNoturno;
    }
  
    public double ganhoAnual() {
      double salarioAnual = super.ganhoAnual();
      if (turno.equals("noite")) {
        salarioAnual += (adicionalNoturno * 12);
      }
      return salarioAnual;
    }
  
    public String toString() {
        return "Administrativo " + getMat() + ": " + super.toString() + ", turno: " + turno + 
        ", adicional noturno: R$" + adicionalNoturno;
    }
  }
  