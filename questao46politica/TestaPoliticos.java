package questao46politica;

public class TestaPoliticos {
    public static void main(String[] args) {
        Politico poli1 = new Politico("João", 40, "PT");
        Prefeito pref1 = new Prefeito("Maria", 45, "PSDB", "PB");
        Governador gov1 = new Governador("José", 50, "PDT", "RN");

        System.out.println(poli1);
        System.out.println();
        System.out.println(pref1);
        System.out.println();
        System.out.println(gov1);
        System.out.println();
    }
}
