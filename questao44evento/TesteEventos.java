package questao44evento;

public class TesteEventos {
    public static void main(String[] args) {
        DataHora dh1 = new DataHora(9, 4, 2023, 14, 30);
        EventoDelegacao ed1 = new EventoDelegacao("Reunião de negócios", dh1);
        System.out.println(ed1);

        EventoHeranca eh1 = new EventoHeranca("Festa de Aniversário", 10, 4, 2023, 20, 0);
        System.out.println(eh1);
    }
}