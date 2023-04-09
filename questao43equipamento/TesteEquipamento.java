package questao43equipamento;

public class TesteEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Samsung", 2000);
        System.out.println(equipamento);

        Computador computador = new Computador("Dell", 4000, 8, "Intel Core i5");
        System.out.println(computador);
    }
}