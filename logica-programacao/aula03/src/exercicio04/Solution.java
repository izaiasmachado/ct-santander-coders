package exercicio04;

import java.util.HashMap;

public class Solution {
    public static int primeiroCaractereUnico(String input) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int currentValue = map.getOrDefault(currentChar, 0);

            map.put(currentChar, currentValue + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int currentValue = map.get(currentChar);

            if (currentValue == 1) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        String input = "amor";
        int output = primeiroCaractereUnico(input);

        System.out.println(output);
    }
}
