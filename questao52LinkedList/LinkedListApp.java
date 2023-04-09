package questao52LinkedList;
import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<Character> listaOriginal = new LinkedList<>();
        listaOriginal.add('a');
        listaOriginal.add('b');
        listaOriginal.add('c');
        listaOriginal.add('d');
        listaOriginal.add('e');
        listaOriginal.add('f');
        listaOriginal.add('g');
        listaOriginal.add('h');
        listaOriginal.add('i');
        listaOriginal.add('j');

        LinkedList<Character> ListaAoCont = new LinkedList<>();

        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            ListaAoCont.add(listaOriginal.get(i));
        }

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista invertida: " + ListaAoCont);
    }
}
