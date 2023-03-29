package quaetao28time;

public class TesteTime {
    public static void main(String[] args) {
        Time time1 = new Time("Time A");
        Time time2 = new Time("Time B");
        
        System.out.println("----- Resultados iniciais -----");
        System.out.println(time1);
        System.out.println(time2);
        
        System.out.println("\n----- Adicionando vitória do Time A -----");
        time1.adicionarVitoria(3, 1);
        System.out.println(time1);
        System.out.println(time2);
        
        System.out.println("\n----- Adicionando empate do Time B -----");
        time2.adicionarEmpate(1, 1);
        System.out.println(time1);
        System.out.println(time2);
        
        System.out.println("\n----- Adicionando derrota do Time A -----");
        time1.adicionarDerrota(2, 3);
        System.out.println(time1);
        System.out.println(time2);

        System.out.println("\n----- Resultados finais -----");
        System.out.println(time1);
        System.out.println(time2);
    }

}
