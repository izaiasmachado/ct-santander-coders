package exercicio03;

public class Solution {
    private static double truncatePlaces = 2;
    private static double truncateFactor = Math.pow(10, truncatePlaces);

    public static double getRaisePercentage(double workedYears) {
        if (workedYears >= 1 && workedYears <= 5) {
            return 0.01;
        } else if (workedYears > 5 && workedYears <= 10) {
            return 0.015;
        } else if (workedYears > 10) {
            return 0.02;
        }

        return 0;
    }

    public static double calculoSalario(double[] input) {
        double workedYears = input[0];
        double inflation = input[1];
        double salary = input[2];

        double raisePercentage = getRaisePercentage(workedYears);
        System.out.println(raisePercentage);

        double inflationPercentage = inflation / 100;

        System.out.println(inflationPercentage);
        double totalPercentage = raisePercentage + inflationPercentage;

        System.out.println(totalPercentage);
        double newSalary = (1 + totalPercentage) * salary;
        double truncatedNewSalary = Math.round(newSalary * truncateFactor) / truncateFactor;

        return truncatedNewSalary;
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
