package exercicio05;

public class Solution {
    public static boolean elementosRepetidos(double[] input) {
        for (int i = 0; i < input.length; i++) {
            double current = input[i];

            for (int j = i + 1; j < input.length; j++) {
                double next = input[j];

                if (current == next) {
                    return true;
                }
            }
        }

        return false;
    }
}
