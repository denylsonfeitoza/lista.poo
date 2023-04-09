package questao47empresa;

public class TesteEmpresa {
    public static void main(String[] args) {
      Assistente a = new Assistente("Maria", 1500, 1);
      a.aumentarSalario(200);
      System.out.println(a);
      System.out.printf("Ganho anual: R$%.2f\n", a.ganhoAnual());
  
      Tecnico t = new Tecnico("Pedro", 2000, 2, 500);
      t.aumentarSalario(300);
      System.out.println(t);
      System.out.printf("Ganho anual: R$%.2f\n", t.ganhoAnual());
  
      Administrativo adm = new Administrativo("Ana", 2500, 3, "noite", 200);
      adm.aumentarSalario(400);
      System.out.println(adm);
      System.out.printf("Ganho anual: R$%.2f\n", adm.ganhoAnual());
    }
}