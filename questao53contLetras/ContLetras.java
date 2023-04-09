package questao53contLetras;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContLetras {

    public static void main(String[] args) {

        String ent = "APENAS UM TESTE";

        ent = ent.toUpperCase();

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < ent.length(); i++) {
            char currentChar = ent.charAt(i);
            if (Character.isLetter(currentChar)) {
                if (countMap.containsKey(currentChar)) {
                    countMap.put(currentChar, countMap.get(currentChar) + 1);
                } else {
                    countMap.put(currentChar, 1);
                }
            }
        }

        Map<Character, Integer> sortedMap = new TreeMap<>(countMap);

        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}