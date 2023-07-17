package exercicio03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static double round(double input) {
        double truncatePlaces = 2;
        double truncateFactor = Math.pow(10, truncatePlaces);

        BigDecimal bd = new BigDecimal(input * truncateFactor / truncateFactor);
        bd = bd.setScale(3, RoundingMode.DOWN);
        bd = bd.setScale(2, RoundingMode.HALF_DOWN);

        return bd.doubleValue();
    }

    public static double getRaisePercentage(double workedYears) {
        if (workedYears >= 1 && workedYears < 5) {
            return 0.01;
        } else if (workedYears >= 5 && workedYears < 10) {
            return 0.015;
        } else if (workedYears >= 10) {
            return 0.02;
        }

        return 0;
    }

    public static double calculoSalario(double[] input) {
        double workedYears = input[0];
        double inflation = input[1];
        double salary = input[2];

        double raisePercentage = getRaisePercentage(workedYears);

        double inflationPercentage = inflation / 100;
        double totalPercentage = raisePercentage + inflationPercentage;

        double newSalary = (1 + totalPercentage) * salary;
        double roundedNewSalary = round(newSalary);

        return roundedNewSalary;
    }

    public static void main(String[] args) {
        double[] input = { 1,
                5.7,
                4800

        };
        double output = calculoSalario(input);

        System.out.println(output);
    }
}
