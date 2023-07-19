package exercicio05;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    // Crie uma função que recebe uma string e retorna o índice do primeiro
    // caractere não repetido da string. Caso não exista caractere único na palavra
    // em questão, retornar -1.

    public static int primeiroCaractereUnico(String input) {
        HashMap<Character, Integer> map = getCharacterCount(input);
        int index = getIndexRepeatedCharacter(map, input);
        return index;
    }

    public static HashMap<Character, Integer> getCharacterCount(String input) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (Character character : input.toCharArray()) {
            int currentCount = map.getOrDefault(character, 0);
            map.put(character, currentCount + 1);
        }

        return map;
    }

    public static int getIndexRepeatedCharacter(HashMap<Character, Integer> map, String input) {
        for (int i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);
            int currentCount = map.get(character);

            if (currentCount == 1) {
                return i;
            }
        }

        return -1;
    }
}
