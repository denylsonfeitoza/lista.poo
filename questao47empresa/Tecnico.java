package questao47empresa;

public class Tecnico extends Assistente {
    private double bonusSalarial;
  
    public Tecnico(String nome, double salario, int mat, double bonusSalarial) {
      super(nome, salario, mat);
      this.bonusSalarial = bonusSalarial;
    }
  
    public double ganhoAnual() {
      return super.ganhoAnual() + bonusSalarial;
    }
  
    public String toString() {
      return "Técnico " + getMat() + ": " + super.toString() + ", bônus salarial: R$" + bonusSalarial;
    }
  }
  